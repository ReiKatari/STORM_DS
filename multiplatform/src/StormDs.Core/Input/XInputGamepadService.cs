// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using System.Runtime.InteropServices;

namespace StormDs.Core.Input;

/// <summary>
/// NativeAOT-compatible XInput gamepad reader mapping Xbox / XInput controller 0
/// directly onto Nintendo DS active-high input bits.
/// </summary>
public sealed unsafe class XInputGamepadService
{
    private const int Deadzone = 8000;

    private const ushort XINPUT_GAMEPAD_DPAD_UP = 0x0001;
    private const ushort XINPUT_GAMEPAD_DPAD_DOWN = 0x0002;
    private const ushort XINPUT_GAMEPAD_DPAD_LEFT = 0x0004;
    private const ushort XINPUT_GAMEPAD_DPAD_RIGHT = 0x0008;
    private const ushort XINPUT_GAMEPAD_START = 0x0010;
    private const ushort XINPUT_GAMEPAD_BACK = 0x0020;
    private const ushort XINPUT_GAMEPAD_LEFT_SHOULDER = 0x0100;
    private const ushort XINPUT_GAMEPAD_RIGHT_SHOULDER = 0x0200;
    private const ushort XINPUT_GAMEPAD_A = 0x1000;
    private const ushort XINPUT_GAMEPAD_B = 0x2000;
    private const ushort XINPUT_GAMEPAD_X = 0x4000;
    private const ushort XINPUT_GAMEPAD_Y = 0x8000;

    [StructLayout(LayoutKind.Sequential)]
    private struct XINPUT_GAMEPAD
    {
        public ushort wButtons;
        public byte bLeftTrigger;
        public byte bRightTrigger;
        public short sThumbLX;
        public short sThumbLY;
        public short sThumbRX;
        public short sThumbRY;
    }

    [StructLayout(LayoutKind.Sequential)]
    private struct XINPUT_STATE
    {
        public uint dwPacketNumber;
        public XINPUT_GAMEPAD Gamepad;
    }

    private readonly delegate* unmanaged[Stdcall]<uint, XINPUT_STATE*, uint> _xInputGetState;

    public bool IsSupported => _xInputGetState != null;

    public bool IsControllerConnected(uint userIndex = 0)
    {
        if (_xInputGetState == null) return false;
        XINPUT_STATE state = default;
        return _xInputGetState(userIndex, &state) == 0;
    }

    public XInputGamepadService()
    {
        if (!OperatingSystem.IsWindows()) return;

        nint lib = nint.Zero;
        if (!NativeLibrary.TryLoad("xinput1_4.dll", out lib) &&
            !NativeLibrary.TryLoad("xinput9_1_0.dll", out lib) &&
            !NativeLibrary.TryLoad("xinput1_3.dll", out lib))
        {
            return;
        }

        if (NativeLibrary.TryGetExport(lib, "XInputGetState", out nint proc))
        {
            _xInputGetState = (delegate* unmanaged[Stdcall]<uint, XINPUT_STATE*, uint>)proc;
        }
    }

    /// <summary>
    /// Reads XInput player 0 state and returns active-high NDS button bits:
    /// 0:A, 1:B, 2:Select, 3:Start, 4:Right, 5:Left, 6:Up, 7:Down, 8:R, 9:L, 10:X, 11:Y.
    /// </summary>
    public uint PollNdsButtonMask()
    {
        if (_xInputGetState == null) return 0;

        XINPUT_STATE state = default;
        if (_xInputGetState(0, &state) != 0)
        {
            return 0;
        }

        ushort b = state.Gamepad.wButtons;
        uint mask = 0;

        // Nintendo layout vs Xbox face buttons: Xbox B->A, Xbox A->B, Xbox Y->X, Xbox X->Y
        if ((b & XINPUT_GAMEPAD_B) != 0) mask |= 1u << 0;      // DS A
        if ((b & XINPUT_GAMEPAD_A) != 0) mask |= 1u << 1;      // DS B
        if ((b & XINPUT_GAMEPAD_BACK) != 0) mask |= 1u << 2;   // Select
        if ((b & XINPUT_GAMEPAD_START) != 0) mask |= 1u << 3;  // Start

        if ((b & XINPUT_GAMEPAD_DPAD_RIGHT) != 0 || state.Gamepad.sThumbLX > Deadzone) mask |= 1u << 4;
        if ((b & XINPUT_GAMEPAD_DPAD_LEFT) != 0 || state.Gamepad.sThumbLX < -Deadzone) mask |= 1u << 5;
        if ((b & XINPUT_GAMEPAD_DPAD_UP) != 0 || state.Gamepad.sThumbLY > Deadzone) mask |= 1u << 6;
        if ((b & XINPUT_GAMEPAD_DPAD_DOWN) != 0 || state.Gamepad.sThumbLY < -Deadzone) mask |= 1u << 7;

        if ((b & XINPUT_GAMEPAD_RIGHT_SHOULDER) != 0 || state.Gamepad.bRightTrigger > 80) mask |= 1u << 8; // R
        if ((b & XINPUT_GAMEPAD_LEFT_SHOULDER) != 0 || state.Gamepad.bLeftTrigger > 80) mask |= 1u << 9;   // L
        if ((b & XINPUT_GAMEPAD_Y) != 0) mask |= 1u << 10;     // DS X
        if ((b & XINPUT_GAMEPAD_X) != 0) mask |= 1u << 11;     // DS Y

        return mask;
    }
}
