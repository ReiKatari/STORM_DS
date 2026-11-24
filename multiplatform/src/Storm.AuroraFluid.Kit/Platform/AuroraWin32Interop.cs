using System;
using System.Runtime.InteropServices;

namespace Storm.AuroraFluid.Kit.Platform;

/// <summary>
/// Low-level Win32 interop for Windows 10/11 DWM dark backdrop and Law 22 UIPI bypass.
/// </summary>
public static class AuroraWin32Interop
{
    private const int DWMWA_USE_IMMERSIVE_DARK_MODE = 20;
    private const int DWMWA_SYSTEMBACKDROP_TYPE = 38;

    private const uint WM_COPYDATA = 0x004A;
    private const uint WM_COPYGLOBALDATA = 0x0049;
    private const uint WM_DROPFILES = 0x0233;
    private const uint MSGFLT_ALLOW = 1;

    [DllImport("dwmapi.dll", PreserveSig = true)]
    private static extern int DwmSetWindowAttribute(IntPtr hwnd, int attr, ref int attrValue, int attrSize);

    [DllImport("user32.dll", SetLastError = true)]
    private static extern bool ChangeWindowMessageFilterEx(IntPtr hWnd, uint msg, uint action, IntPtr pChangeFilterStruct);

    [DllImport("shell32.dll")]
    private static extern void DragAcceptFiles(IntPtr hWnd, bool fAccept);

    /// <summary>
    /// Applies Windows 11 immersive dark mode and Mica backdrop to the native window handle.
    /// </summary>
    public static bool ApplyDwmDarkMode(IntPtr hwnd, bool enableDarkMode = true, bool enableMica = true)
    {
        if (!OperatingSystem.IsWindows() || hwnd == IntPtr.Zero) return false;

        try
        {
            int darkMode = enableDarkMode ? 1 : 0;
            DwmSetWindowAttribute(hwnd, DWMWA_USE_IMMERSIVE_DARK_MODE, ref darkMode, sizeof(int));

            if (enableMica && Environment.OSVersion.Version.Build >= 22000)
            {
                int micaType = 2; // 2 = Mica, 4 = Mica Alt
                DwmSetWindowAttribute(hwnd, DWMWA_SYSTEMBACKDROP_TYPE, ref micaType, sizeof(int));
            }
            return true;
        }
        catch
        {
            return false;
        }
    }

    /// <summary>
    /// Bypasses User Interface Privilege Isolation (UIPI) so drag-and-drop works
    /// seamlessly even when running with Administrator privileges (enforces Law 22).
    /// </summary>
    public static bool EnableElevatedDragDropBypass(IntPtr hwnd)
    {
        if (!OperatingSystem.IsWindows() || hwnd == IntPtr.Zero) return false;

        try
        {
            ChangeWindowMessageFilterEx(hwnd, WM_DROPFILES, MSGFLT_ALLOW, IntPtr.Zero);
            ChangeWindowMessageFilterEx(hwnd, WM_COPYDATA, MSGFLT_ALLOW, IntPtr.Zero);
            ChangeWindowMessageFilterEx(hwnd, WM_COPYGLOBALDATA, MSGFLT_ALLOW, IntPtr.Zero);
            DragAcceptFiles(hwnd, true);
            return true;
        }
        catch
        {
            return false;
        }
    }
}
