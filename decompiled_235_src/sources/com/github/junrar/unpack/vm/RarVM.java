package com.github.junrar.unpack.vm;

import com.github.junrar.crc.RarCRC;
import com.github.junrar.io.Raw;
import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.ppm.RangeCoder;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.vision.common.InputImage;
import java.util.List;
import java.util.Vector;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RarVM extends BitInput {
    private static final long UINT_MASK = -1;
    public static final int VM_FIXEDGLOBALSIZE = 64;
    public static final int VM_GLOBALMEMADDR = 245760;
    public static final int VM_GLOBALMEMSIZE = 8192;
    public static final int VM_MEMMASK = 262143;
    public static final int VM_MEMSIZE = 262144;
    private static final int regCount = 8;
    private int IP;
    private int codeSize;
    private int flags;
    private final int[] R = new int[8];
    private int maxOpCount = 25000000;
    private byte[] mem = null;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: com.github.junrar.unpack.vm.RarVM$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$junrar$unpack$vm$VMCommands;
        static final /* synthetic */ int[] $SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters;

        static {
            int[] iArr = new int[VMStandardFilters.values().length];
            $SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters = iArr;
            try {
                iArr[VMStandardFilters.VMSF_E8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters[VMStandardFilters.VMSF_E8E9.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters[VMStandardFilters.VMSF_ITANIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters[VMStandardFilters.VMSF_DELTA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters[VMStandardFilters.VMSF_RGB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters[VMStandardFilters.VMSF_AUDIO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters[VMStandardFilters.VMSF_UPCASE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[VMCommands.values().length];
            $SwitchMap$com$github$junrar$unpack$vm$VMCommands = iArr2;
            try {
                iArr2[VMCommands.VM_MOV.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_MOVB.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_MOVD.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_CMP.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_CMPB.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_CMPD.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_ADD.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_ADDB.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_ADDD.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_SUB.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_SUBB.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_SUBD.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_JZ.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_JNZ.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_INC.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_INCB.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_INCD.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_DEC.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_DECB.ordinal()] = 19;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_DECD.ordinal()] = 20;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_JMP.ordinal()] = 21;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_XOR.ordinal()] = 22;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_AND.ordinal()] = 23;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_OR.ordinal()] = 24;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_TEST.ordinal()] = 25;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_JS.ordinal()] = 26;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_JNS.ordinal()] = 27;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_JB.ordinal()] = 28;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_JBE.ordinal()] = 29;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_JA.ordinal()] = 30;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_JAE.ordinal()] = 31;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_PUSH.ordinal()] = 32;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_POP.ordinal()] = 33;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_CALL.ordinal()] = 34;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_NOT.ordinal()] = 35;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_SHL.ordinal()] = 36;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_SHR.ordinal()] = 37;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_SAR.ordinal()] = 38;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_NEG.ordinal()] = 39;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_NEGB.ordinal()] = 40;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_NEGD.ordinal()] = 41;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_PUSHA.ordinal()] = 42;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_POPA.ordinal()] = 43;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_PUSHF.ordinal()] = 44;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_POPF.ordinal()] = 45;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_MOVZX.ordinal()] = 46;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_MOVSX.ordinal()] = 47;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_XCHG.ordinal()] = 48;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_MUL.ordinal()] = 49;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_DIV.ordinal()] = 50;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_ADC.ordinal()] = 51;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_SBB.ordinal()] = 52;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_RET.ordinal()] = 53;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_STANDARD.ordinal()] = 54;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                $SwitchMap$com$github$junrar$unpack$vm$VMCommands[VMCommands.VM_PRINT.ordinal()] = 55;
            } catch (NoSuchFieldError unused62) {
            }
        }
    }

    private boolean ExecuteCode(List<VMPreparedCommand> list, int i) {
        int flag;
        int flag2;
        int flag3;
        int flag4;
        int i2;
        byte[] bArr;
        byte[] bArr2;
        int flag5;
        byte[] bArr3;
        byte[] bArr4;
        int flag6;
        int flag7;
        byte[] bArr5;
        byte[] bArr6;
        int flag8;
        int flag9;
        int flag10;
        int flag11;
        int flag12;
        int i3;
        int flag13;
        int flag14;
        int flag15;
        int[] iArr;
        int i4;
        int i5;
        this.maxOpCount = 25000000;
        this.codeSize = i;
        this.IP = 0;
        while (true) {
            VMPreparedCommand vMPreparedCommand = list.get(this.IP);
            int operand = getOperand(vMPreparedCommand.getOp1());
            int operand2 = getOperand(vMPreparedCommand.getOp2());
            switch (AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands[vMPreparedCommand.getOpCode().ordinal()]) {
                case 1:
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, getValue(vMPreparedCommand.isByteMode(), this.mem, operand2));
                    break;
                case 2:
                    byte[] bArr7 = this.mem;
                    setValue(true, bArr7, operand, getValue(true, bArr7, operand2));
                    break;
                case 3:
                    byte[] bArr8 = this.mem;
                    setValue(false, bArr8, operand, getValue(false, bArr8, operand2));
                    break;
                case 4:
                    int value = getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    int value2 = value - getValue(vMPreparedCommand.isByteMode(), this.mem, operand2);
                    if (value2 == 0) {
                        this.flags = VMFlags.VM_FZ.getFlag();
                        break;
                    } else {
                        if (value2 > value) {
                            flag = 1;
                        } else {
                            flag = value2 & VMFlags.VM_FS.getFlag();
                        }
                        this.flags = flag;
                        break;
                    }
                case 5:
                    int value3 = getValue(true, this.mem, operand);
                    int value4 = value3 - getValue(true, this.mem, operand2);
                    if (value4 == 0) {
                        this.flags = VMFlags.VM_FZ.getFlag();
                        break;
                    } else {
                        if (value4 > value3) {
                            flag2 = 1;
                        } else {
                            flag2 = VMFlags.VM_FS.getFlag() & value4;
                        }
                        this.flags = flag2;
                        break;
                    }
                case 6:
                    int value5 = getValue(false, this.mem, operand);
                    int value6 = value5 - getValue(false, this.mem, operand2);
                    if (value6 == 0) {
                        this.flags = VMFlags.VM_FZ.getFlag();
                        break;
                    } else {
                        if (value6 > value5) {
                            flag3 = 1;
                        } else {
                            flag3 = VMFlags.VM_FS.getFlag() & value6;
                        }
                        this.flags = flag3;
                        break;
                    }
                case 7:
                    int value7 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    int value8 = (int) (value7 + getValue(vMPreparedCommand.isByteMode(), this.mem, operand2));
                    if (vMPreparedCommand.isByteMode()) {
                        int i6 = value8 & 255;
                        if (i6 < value7) {
                            i2 = 1;
                        } else if (i6 == 0) {
                            i2 = VMFlags.VM_FZ.getFlag();
                        } else if ((value8 & 128) != 0) {
                            i2 = VMFlags.VM_FS.getFlag();
                        } else {
                            i2 = 0;
                        }
                        this.flags = i2;
                        value8 = i6;
                    } else {
                        if (value8 < value7) {
                            flag4 = 1;
                        } else if (value8 == 0) {
                            flag4 = VMFlags.VM_FZ.getFlag();
                        } else {
                            flag4 = VMFlags.VM_FS.getFlag() & value8;
                        }
                        this.flags = flag4;
                    }
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, value8);
                    break;
                case 8:
                    setValue(true, this.mem, operand, (int) (getValue(true, bArr, operand) & (getValue(true, this.mem, operand2) + UINT_MASK)));
                    break;
                case 9:
                    setValue(false, this.mem, operand, (int) (getValue(false, bArr2, operand) & (getValue(false, this.mem, operand2) + UINT_MASK)));
                    break;
                case 10:
                    int value9 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    int value10 = (int) (value9 & (UINT_MASK - getValue(vMPreparedCommand.isByteMode(), this.mem, operand2)));
                    if (value10 == 0) {
                        flag5 = VMFlags.VM_FZ.getFlag();
                    } else if (value10 > value9) {
                        flag5 = 1;
                    } else {
                        flag5 = VMFlags.VM_FS.getFlag() & value10;
                    }
                    this.flags = flag5;
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, value10);
                    break;
                case 11:
                    setValue(true, this.mem, operand, (int) (getValue(true, bArr3, operand) & (UINT_MASK - getValue(true, this.mem, operand2))));
                    break;
                case 12:
                    setValue(false, this.mem, operand, (int) (getValue(false, bArr4, operand) & (UINT_MASK - getValue(false, this.mem, operand2))));
                    break;
                case 13:
                    if ((this.flags & VMFlags.VM_FZ.getFlag()) == 0) {
                        break;
                    } else {
                        setIP(getValue(false, this.mem, operand));
                        continue;
                    }
                case 14:
                    if ((this.flags & VMFlags.VM_FZ.getFlag()) != 0) {
                        break;
                    } else {
                        setIP(getValue(false, this.mem, operand));
                        continue;
                    }
                case 15:
                    getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    int i7 = (int) 0;
                    if (vMPreparedCommand.isByteMode()) {
                        i7 &= 255;
                    }
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, i7);
                    if (i7 == 0) {
                        flag6 = VMFlags.VM_FZ.getFlag();
                    } else {
                        flag6 = VMFlags.VM_FS.getFlag() & i7;
                    }
                    this.flags = flag6;
                    break;
                case 16:
                    byte[] bArr9 = this.mem;
                    getValue(true, bArr9, operand);
                    setValue(true, bArr9, operand, (int) 0);
                    break;
                case 17:
                    byte[] bArr10 = this.mem;
                    getValue(false, bArr10, operand);
                    setValue(false, bArr10, operand, (int) 0);
                    break;
                case 18:
                    int value11 = (int) (getValue(vMPreparedCommand.isByteMode(), this.mem, operand) & (-2));
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, value11);
                    if (value11 == 0) {
                        flag7 = VMFlags.VM_FZ.getFlag();
                    } else {
                        flag7 = VMFlags.VM_FS.getFlag() & value11;
                    }
                    this.flags = flag7;
                    break;
                case 19:
                    setValue(true, this.mem, operand, (int) (getValue(true, bArr5, operand) & (-2)));
                    break;
                case 20:
                    setValue(false, this.mem, operand, (int) (getValue(false, bArr6, operand) & (-2)));
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    setIP(getValue(false, this.mem, operand));
                    continue;
                case 22:
                    int value12 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand2) ^ getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    if (value12 == 0) {
                        flag8 = VMFlags.VM_FZ.getFlag();
                    } else {
                        flag8 = VMFlags.VM_FS.getFlag() & value12;
                    }
                    this.flags = flag8;
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, value12);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    int value13 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand2) & getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    if (value13 == 0) {
                        flag9 = VMFlags.VM_FZ.getFlag();
                    } else {
                        flag9 = VMFlags.VM_FS.getFlag() & value13;
                    }
                    this.flags = flag9;
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, value13);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    int value14 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand2) | getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    if (value14 == 0) {
                        flag10 = VMFlags.VM_FZ.getFlag();
                    } else {
                        flag10 = VMFlags.VM_FS.getFlag() & value14;
                    }
                    this.flags = flag10;
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, value14);
                    break;
                case 25:
                    int value15 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand2) & getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    if (value15 == 0) {
                        flag11 = VMFlags.VM_FZ.getFlag();
                    } else {
                        flag11 = value15 & VMFlags.VM_FS.getFlag();
                    }
                    this.flags = flag11;
                    break;
                case SubAllocator.N4 /* 26 */:
                    if ((this.flags & VMFlags.VM_FS.getFlag()) == 0) {
                        break;
                    } else {
                        setIP(getValue(false, this.mem, operand));
                        continue;
                    }
                case 27:
                    if ((this.flags & VMFlags.VM_FS.getFlag()) != 0) {
                        break;
                    } else {
                        setIP(getValue(false, this.mem, operand));
                        continue;
                    }
                case 28:
                    if ((this.flags & VMFlags.VM_FC.getFlag()) == 0) {
                        break;
                    } else {
                        setIP(getValue(false, this.mem, operand));
                        continue;
                    }
                case 29:
                    if ((this.flags & (VMFlags.VM_FC.getFlag() | VMFlags.VM_FZ.getFlag())) == 0) {
                        break;
                    } else {
                        setIP(getValue(false, this.mem, operand));
                        continue;
                    }
                case 30:
                    if ((this.flags & (VMFlags.VM_FC.getFlag() | VMFlags.VM_FZ.getFlag())) != 0) {
                        break;
                    } else {
                        setIP(getValue(false, this.mem, operand));
                        continue;
                    }
                case 31:
                    if ((this.flags & VMFlags.VM_FC.getFlag()) != 0) {
                        break;
                    } else {
                        setIP(getValue(false, this.mem, operand));
                        continue;
                    }
                case 32:
                    int[] iArr2 = this.R;
                    int i8 = iArr2[7] - 4;
                    iArr2[7] = i8;
                    byte[] bArr11 = this.mem;
                    setValue(false, bArr11, i8 & VM_MEMMASK, getValue(false, bArr11, operand));
                    break;
                case 33:
                    byte[] bArr12 = this.mem;
                    setValue(false, bArr12, operand, getValue(false, bArr12, this.R[7] & VM_MEMMASK));
                    int[] iArr3 = this.R;
                    iArr3[7] = iArr3[7] + 4;
                    break;
                case 34:
                    int[] iArr4 = this.R;
                    int i9 = iArr4[7] - 4;
                    iArr4[7] = i9;
                    setValue(false, this.mem, i9 & VM_MEMMASK, this.IP + 1);
                    setIP(getValue(false, this.mem, operand));
                    continue;
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, ~getValue(vMPreparedCommand.isByteMode(), this.mem, operand));
                    break;
                case 36:
                    int value16 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    int value17 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand2);
                    int i10 = value16 << value17;
                    if (i10 == 0) {
                        flag12 = VMFlags.VM_FZ.getFlag();
                    } else {
                        flag12 = VMFlags.VM_FS.getFlag() & i10;
                    }
                    if (((value16 << (value17 - 1)) & Integer.MIN_VALUE) != 0) {
                        i3 = VMFlags.VM_FC.getFlag();
                    } else {
                        i3 = 0;
                    }
                    this.flags = i3 | flag12;
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, i10);
                    break;
                case 37:
                    int value18 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    int value19 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand2);
                    int i11 = value18 >>> value19;
                    if (i11 == 0) {
                        flag13 = VMFlags.VM_FZ.getFlag();
                    } else {
                        flag13 = VMFlags.VM_FS.getFlag() & i11;
                    }
                    this.flags = ((value18 >>> (value19 - 1)) & VMFlags.VM_FC.getFlag()) | flag13;
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, i11);
                    break;
                case SubAllocator.N_INDEXES /* 38 */:
                    int value20 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    int value21 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand2);
                    int i12 = value20 >>> value21;
                    if (i12 == 0) {
                        flag14 = VMFlags.VM_FZ.getFlag();
                    } else {
                        flag14 = VMFlags.VM_FS.getFlag() & i12;
                    }
                    this.flags = ((value20 >>> (value21 - 1)) & VMFlags.VM_FC.getFlag()) | flag14;
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, i12);
                    break;
                case 39:
                    int i13 = -getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    if (i13 == 0) {
                        flag15 = VMFlags.VM_FZ.getFlag();
                    } else {
                        flag15 = VMFlags.VM_FC.getFlag() | (VMFlags.VM_FS.getFlag() & i13);
                    }
                    this.flags = flag15;
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, i13);
                    break;
                case 40:
                    byte[] bArr13 = this.mem;
                    setValue(true, bArr13, operand, -getValue(true, bArr13, operand));
                    break;
                case 41:
                    byte[] bArr14 = this.mem;
                    setValue(false, bArr14, operand, -getValue(false, bArr14, operand));
                    break;
                case 42:
                    int i14 = this.R[7] - 4;
                    int i15 = 0;
                    while (i15 < 8) {
                        setValue(false, this.mem, i14 & VM_MEMMASK, this.R[i15]);
                        i15++;
                        i14 -= 4;
                    }
                    this.R[7] = iArr[7] - 32;
                    break;
                case 43:
                    int i16 = this.R[7];
                    int i17 = 0;
                    while (i17 < 8) {
                        this.R[7 - i17] = getValue(false, this.mem, i16 & VM_MEMMASK);
                        i17++;
                        i16 += 4;
                    }
                    break;
                case 44:
                    int[] iArr5 = this.R;
                    int i18 = iArr5[7] - 4;
                    iArr5[7] = i18;
                    setValue(false, this.mem, i18 & VM_MEMMASK, this.flags);
                    break;
                case 45:
                    this.flags = getValue(false, this.mem, this.R[7] & VM_MEMMASK);
                    int[] iArr6 = this.R;
                    iArr6[7] = iArr6[7] + 4;
                    break;
                case 46:
                    byte[] bArr15 = this.mem;
                    setValue(false, bArr15, operand, getValue(true, bArr15, operand2));
                    break;
                case 47:
                    byte[] bArr16 = this.mem;
                    setValue(false, bArr16, operand, (byte) getValue(true, bArr16, operand2));
                    break;
                case Compress.DC20 /* 48 */:
                    int value22 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, getValue(vMPreparedCommand.isByteMode(), this.mem, operand2));
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand2, value22);
                    break;
                case 49:
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, (int) (getValue(vMPreparedCommand.isByteMode(), this.mem, operand) & (getValue(vMPreparedCommand.isByteMode(), this.mem, operand2) * UINT_MASK)));
                    break;
                case 50:
                    int value23 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand2);
                    if (value23 != 0) {
                        setValue(vMPreparedCommand.isByteMode(), this.mem, operand, getValue(vMPreparedCommand.isByteMode(), this.mem, operand) / value23);
                        break;
                    }
                    break;
                case 51:
                    int value24 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    int flag16 = this.flags & VMFlags.VM_FC.getFlag();
                    int value25 = (int) (value24 & (getValue(vMPreparedCommand.isByteMode(), this.mem, operand2) + UINT_MASK) & (flag16 + UINT_MASK));
                    if (vMPreparedCommand.isByteMode()) {
                        value25 &= 255;
                    }
                    if (value25 >= value24 && (value25 != value24 || flag16 == 0)) {
                        if (value25 == 0) {
                            i4 = VMFlags.VM_FZ.getFlag();
                        } else {
                            i4 = VMFlags.VM_FS.getFlag() & value25;
                        }
                    } else {
                        i4 = 1;
                    }
                    this.flags = i4;
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, value25);
                    break;
                case 52:
                    int value26 = getValue(vMPreparedCommand.isByteMode(), this.mem, operand);
                    int flag17 = this.flags & VMFlags.VM_FC.getFlag();
                    int value27 = (int) (value26 & (UINT_MASK - getValue(vMPreparedCommand.isByteMode(), this.mem, operand2)) & (UINT_MASK - flag17));
                    if (vMPreparedCommand.isByteMode()) {
                        value27 &= 255;
                    }
                    if (value27 <= value26 && (value27 != value26 || flag17 == 0)) {
                        if (value27 == 0) {
                            i5 = VMFlags.VM_FZ.getFlag();
                        } else {
                            i5 = VMFlags.VM_FS.getFlag() & value27;
                        }
                    } else {
                        i5 = 1;
                    }
                    this.flags = i5;
                    setValue(vMPreparedCommand.isByteMode(), this.mem, operand, value27);
                    break;
                case 53:
                    int i19 = this.R[7];
                    if (i19 >= 262144) {
                        return true;
                    }
                    setIP(getValue(false, this.mem, i19 & VM_MEMMASK));
                    int[] iArr7 = this.R;
                    iArr7[7] = iArr7[7] + 4;
                    continue;
                case 54:
                    ExecuteStandardFilter(VMStandardFilters.findFilter(vMPreparedCommand.getOp1().getData()));
                    break;
            }
            this.IP++;
            this.maxOpCount--;
        }
    }

    private void ExecuteStandardFilter(VMStandardFilters vMStandardFilters) {
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        char c;
        char c2 = 2;
        char c3 = 4;
        int i9 = 0;
        switch (AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters[vMStandardFilters.ordinal()]) {
            case 1:
            case 2:
                int[] iArr = this.R;
                int i10 = iArr[4];
                long j = iArr[6];
                if (i10 < 245760) {
                    if (vMStandardFilters == VMStandardFilters.VMSF_E8E9) {
                        i = 233;
                    } else {
                        i = 232;
                    }
                    byte b2 = (byte) i;
                    int i11 = 0;
                    while (i11 < i10 - 4) {
                        byte[] bArr2 = this.mem;
                        int i12 = i11 + 1;
                        byte b3 = bArr2[i11];
                        if (b3 != -24 && b3 != b2) {
                            i11 = i12;
                        } else {
                            long j2 = i12 + j;
                            long value = getValue(false, bArr2, i12);
                            if ((value & (-2147483648L)) != 0) {
                                if (((j2 + value) & (-2147483648L)) == 0) {
                                    setValue(false, this.mem, i12, ((int) value) + RangeCoder.TOP);
                                }
                            } else if (((-2147483648L) & (value - 16777216)) != 0) {
                                setValue(false, this.mem, i12, (int) (value - j2));
                            }
                            i11 += 5;
                        }
                    }
                    return;
                }
                return;
            case 3:
                int i13 = 2;
                int i14 = 4;
                int i15 = 5;
                int[] iArr2 = this.R;
                int i16 = iArr2[4];
                long j3 = iArr2[6];
                if (i16 < 245760) {
                    byte[] bArr3 = {4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};
                    long j4 = j3 >>> 4;
                    int i17 = 0;
                    while (i17 < i16 - 21) {
                        int i18 = (this.mem[i17] & 31) - 16;
                        if (i18 >= 0 && (b = bArr3[i18]) != 0) {
                            i3 = i13;
                            int i19 = 0;
                            while (i19 <= i3) {
                                if (((1 << i19) & b) != 0) {
                                    int i20 = i19 * 41;
                                    i4 = i15;
                                    if (filterItanium_GetBits(i17, i20 + 42, i14) == i4) {
                                        filterItanium_SetBits(i17, ((int) (filterItanium_GetBits(i17, i5, 20) - j4)) & 1048575, i20 + 18, 20);
                                    }
                                } else {
                                    i4 = i15;
                                }
                                i19++;
                                i15 = i4;
                                i14 = 4;
                            }
                            i2 = i15;
                        } else {
                            i2 = i15;
                            i3 = i13;
                        }
                        i17 += 16;
                        j4++;
                        i13 = i3;
                        i15 = i2;
                        i14 = 4;
                    }
                    return;
                }
                return;
            case 4:
                int[] iArr3 = this.R;
                int i21 = iArr3[4];
                int i22 = iArr3[0];
                int i23 = i21 * 2;
                setValue(false, this.mem, 245792, i21);
                if (i21 < 122880) {
                    int i24 = 0;
                    for (int i25 = 0; i25 < i22; i25++) {
                        int i26 = i21 + i25;
                        byte b4 = 0;
                        while (i26 < i23) {
                            byte[] bArr4 = this.mem;
                            b4 = (byte) (b4 - bArr4[i24]);
                            bArr4[i26] = b4;
                            i26 += i22;
                            i24++;
                        }
                    }
                    return;
                }
                return;
            case 5:
                int[] iArr4 = this.R;
                int i27 = iArr4[4];
                int i28 = iArr4[0] - 3;
                int i29 = iArr4[1];
                setValue(false, this.mem, 245792, i27);
                if (i27 < 122880 && i29 >= 0) {
                    int i30 = 3;
                    int i31 = 0;
                    int i32 = 0;
                    while (i31 < i30) {
                        int i33 = i31;
                        long j5 = 0;
                        while (i33 < i27) {
                            int i34 = i33 - i28;
                            if (i34 >= i30) {
                                int i35 = i34 + i27;
                                byte[] bArr5 = this.mem;
                                long j6 = bArr5[i35] & 255;
                                long j7 = bArr5[i35 - i30] & 255;
                                long j8 = (j5 + j6) - j7;
                                i7 = i33;
                                int abs = Math.abs((int) (j8 - j5));
                                i8 = i29;
                                i6 = i27;
                                int abs2 = Math.abs((int) (j8 - j6));
                                int abs3 = Math.abs((int) (j8 - j7));
                                if (abs > abs2 || abs > abs3) {
                                    if (abs2 <= abs3) {
                                        j5 = j6;
                                    } else {
                                        j5 = j7;
                                    }
                                }
                            } else {
                                i6 = i27;
                                i7 = i33;
                                i8 = i29;
                            }
                            long j9 = j5 - bArr[i32];
                            this.mem[i6 + i7] = (byte) (j9 & 255);
                            int i36 = i8;
                            i33 = i7 + 3;
                            i29 = i36;
                            i32++;
                            j5 = j9 & 255;
                            i30 = 3;
                            i27 = i6;
                        }
                        i31++;
                        i30 = 3;
                    }
                    int i37 = i27;
                    int i38 = i37 - 2;
                    while (i29 < i38) {
                        byte[] bArr6 = this.mem;
                        int i39 = i37 + i29;
                        byte b5 = bArr6[i39 + 1];
                        bArr6[i39] = (byte) (bArr6[i39] + b5);
                        int i40 = i39 + 2;
                        bArr6[i40] = (byte) (bArr6[i40] + b5);
                        i29 += 3;
                    }
                    return;
                }
                return;
            case 6:
                int[] iArr5 = this.R;
                int i41 = iArr5[4];
                int i42 = iArr5[0];
                setValue(false, this.mem, 245792, i41);
                if (i41 < 122880) {
                    int i43 = 0;
                    int i44 = 0;
                    while (i43 < i42) {
                        long[] jArr = new long[7];
                        int i45 = i9;
                        int i46 = i45;
                        int i47 = i46;
                        int i48 = i47;
                        int i49 = i43;
                        int i50 = i49;
                        char c4 = c2;
                        char c5 = c3;
                        long j10 = 0;
                        long j11 = 0;
                        int i51 = i48;
                        int i52 = i51;
                        while (i50 < i41) {
                            int i53 = (int) j10;
                            int i54 = i53 - i47;
                            int i55 = i9;
                            byte[] bArr7 = this.mem;
                            int i56 = i44 + 1;
                            long j12 = bArr7[i44] & 255;
                            long j13 = ((((((8 * j11) + (i46 * i53)) + (i52 * i54)) + (i51 * i45)) >>> 3) & 255) - j12;
                            bArr7[i41 + i50] = (byte) j13;
                            long j14 = (byte) (j13 - j11);
                            int i57 = ((byte) j12) << 3;
                            int i58 = i42;
                            int i59 = i41;
                            jArr[i55] = jArr[i55] + Math.abs(i57);
                            jArr[1] = jArr[1] + Math.abs(i57 - i53);
                            jArr[c4] = jArr[c4] + Math.abs(i57 + i53);
                            jArr[3] = jArr[3] + Math.abs(i57 - i54);
                            jArr[c5] = jArr[c5] + Math.abs(i57 + i54);
                            jArr[5] = jArr[5] + Math.abs(i57 - i45);
                            jArr[6] = jArr[6] + Math.abs(i57 + i45);
                            if ((i48 & 31) == 0) {
                                long j15 = jArr[i55];
                                jArr[i55] = 0;
                                long j16 = j15;
                                long j17 = 0;
                                c = 7;
                                for (int i60 = 1; i60 < 7; i60++) {
                                    long j18 = jArr[i60];
                                    if (j18 < j16) {
                                        j17 = i60;
                                        j16 = j18;
                                    }
                                    jArr[i60] = 0;
                                }
                                switch ((int) j17) {
                                    case 1:
                                        if (i46 >= -16) {
                                            i46--;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        if (i46 < 16) {
                                            i46++;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        if (i52 >= -16) {
                                            i52--;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 4:
                                        if (i52 < 16) {
                                            i52++;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 5:
                                        if (i51 >= -16) {
                                            i51--;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 6:
                                        if (i51 < 16) {
                                            i51++;
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            } else {
                                c = 7;
                            }
                            i50 += i58;
                            i48++;
                            j11 = j13;
                            i45 = i54;
                            j10 = j14;
                            i44 = i56;
                            i9 = i55;
                            i47 = i53;
                            i41 = i59;
                            i42 = i58;
                        }
                        i43 = i49 + 1;
                        c3 = c5;
                        c2 = c4;
                    }
                    return;
                }
                return;
            case 7:
                int i61 = this.R[4];
                if (i61 < 122880) {
                    int i62 = i61;
                    int i63 = 0;
                    while (true) {
                        byte[] bArr8 = this.mem;
                        if (i63 < i61) {
                            int i64 = i63 + 1;
                            byte b6 = bArr8[i63];
                            if (b6 == 2) {
                                i63 += 2;
                                b6 = bArr8[i64];
                                if (b6 != 2) {
                                    b6 = (byte) (b6 - 32);
                                }
                            } else {
                                i63 = i64;
                            }
                            bArr8[i62] = b6;
                            i62++;
                        } else {
                            setValue(false, bArr8, 245788, i62 - i61);
                            setValue(false, this.mem, 245792, i61);
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    private VMStandardFilters IsStandardFilter(byte[] bArr, int i) {
        VMStandardFilterSignature[] vMStandardFilterSignatureArr = {new VMStandardFilterSignature(53, -1386780537, VMStandardFilters.VMSF_E8), new VMStandardFilterSignature(57, 1020781950, VMStandardFilters.VMSF_E8E9), new VMStandardFilterSignature(120, 929663295, VMStandardFilters.VMSF_ITANIUM), new VMStandardFilterSignature(29, 235276157, VMStandardFilters.VMSF_DELTA), new VMStandardFilterSignature(149, 472669640, VMStandardFilters.VMSF_RGB), new VMStandardFilterSignature(216, -1132075263, VMStandardFilters.VMSF_AUDIO), new VMStandardFilterSignature(40, 1186579808, VMStandardFilters.VMSF_UPCASE)};
        int i2 = ~RarCRC.checkCrc(-1, bArr, 0, bArr.length);
        for (int i3 = 0; i3 < 7; i3++) {
            if (vMStandardFilterSignatureArr[i3].getCRC() == i2 && vMStandardFilterSignatureArr[i3].getLength() == bArr.length) {
                return vMStandardFilterSignatureArr[i3].getType();
            }
        }
        return VMStandardFilters.VMSF_NONE;
    }

    public static int ReadData(BitInput bitInput) {
        int fgetbits = bitInput.fgetbits();
        int i = 49152 & fgetbits;
        if (i != 0) {
            if (i != 16384) {
                if (i != 32768) {
                    bitInput.faddbits(2);
                    bitInput.faddbits(16);
                    int fgetbits2 = (bitInput.fgetbits() << 16) | bitInput.fgetbits();
                    bitInput.faddbits(16);
                    return fgetbits2;
                }
                bitInput.faddbits(2);
                int fgetbits3 = bitInput.fgetbits();
                bitInput.faddbits(16);
                return fgetbits3;
            } else if ((fgetbits & 15360) == 0) {
                int i2 = ((fgetbits >>> 2) & 255) | (-256);
                bitInput.faddbits(14);
                return i2;
            } else {
                int i3 = (fgetbits >>> 6) & 255;
                bitInput.faddbits(10);
                return i3;
            }
        }
        bitInput.faddbits(6);
        return (fgetbits >>> 10) & 15;
    }

    private void decodeArg(VMPreparedOperand vMPreparedOperand, boolean z) {
        int fgetbits = fgetbits();
        if ((32768 & fgetbits) != 0) {
            vMPreparedOperand.setType(VMOpType.VM_OPREG);
            vMPreparedOperand.setData((fgetbits >>> 12) & 7);
            vMPreparedOperand.setOffset(vMPreparedOperand.getData());
            faddbits(4);
        } else if ((49152 & fgetbits) == 0) {
            vMPreparedOperand.setType(VMOpType.VM_OPINT);
            if (z) {
                vMPreparedOperand.setData((fgetbits >>> 6) & 255);
                faddbits(10);
                return;
            }
            faddbits(2);
            vMPreparedOperand.setData(ReadData(this));
        } else {
            vMPreparedOperand.setType(VMOpType.VM_OPREGMEM);
            if ((fgetbits & 8192) == 0) {
                vMPreparedOperand.setData((fgetbits >>> 10) & 7);
                vMPreparedOperand.setOffset(vMPreparedOperand.getData());
                vMPreparedOperand.setBase(0);
                faddbits(6);
                return;
            }
            if ((fgetbits & 4096) == 0) {
                vMPreparedOperand.setData((fgetbits >>> 9) & 7);
                vMPreparedOperand.setOffset(vMPreparedOperand.getData());
                faddbits(7);
            } else {
                vMPreparedOperand.setData(0);
                faddbits(4);
            }
            vMPreparedOperand.setBase(ReadData(this));
        }
    }

    private int filterItanium_GetBits(int i, int i2, int i3) {
        int i4 = i2 / 8;
        byte[] bArr = this.mem;
        int i5 = (bArr[(i4 + 1) + i] & 255) << 8;
        int i6 = (bArr[i + (i4 + 3)] & 255) << 24;
        return ((i6 | ((i5 | (bArr[i + i4] & 255)) | ((bArr[(i4 + 2) + i] & 255) << 16))) >>> (i2 & 7)) & ((-1) >>> (32 - i3));
    }

    private void filterItanium_SetBits(int i, int i2, int i3, int i4) {
        int i5 = i3 / 8;
        int i6 = i3 & 7;
        int i7 = ~(((-1) >>> (32 - i4)) << i6);
        int i8 = i2 << i6;
        for (int i9 = 0; i9 < 4; i9++) {
            byte[] bArr = this.mem;
            int i10 = i + i5 + i9;
            byte b = (byte) (bArr[i10] & i7);
            bArr[i10] = b;
            bArr[i10] = (byte) (b | i8);
            i7 = (i7 >>> 8) | (-16777216);
            i8 >>>= 8;
        }
    }

    private int getOperand(VMPreparedOperand vMPreparedOperand) {
        if (vMPreparedOperand.getType() == VMOpType.VM_OPREGMEM) {
            return Raw.readIntLittleEndian(this.mem, (vMPreparedOperand.getBase() + vMPreparedOperand.getOffset()) & VM_MEMMASK);
        }
        return Raw.readIntLittleEndian(this.mem, vMPreparedOperand.getOffset());
    }

    private int getValue(boolean z, byte[] bArr, int i) {
        if (z) {
            if (isVMMem(bArr)) {
                return bArr[i];
            }
            return bArr[i] & 255;
        } else if (isVMMem(bArr)) {
            return Raw.readIntLittleEndian(bArr, i);
        } else {
            return Raw.readIntBigEndian(bArr, i);
        }
    }

    private boolean isVMMem(byte[] bArr) {
        if (this.mem == bArr) {
            return true;
        }
        return false;
    }

    private void optimize(VMPreparedProgram vMPreparedProgram) {
        VMCommands vMCommands;
        VMCommands vMCommands2;
        VMCommands vMCommands3;
        VMCommands vMCommands4;
        VMCommands vMCommands5;
        VMCommands vMCommands6;
        VMCommands vMCommands7;
        List<VMPreparedCommand> cmd = vMPreparedProgram.getCmd();
        for (VMPreparedCommand vMPreparedCommand : cmd) {
            int i = AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands[vMPreparedCommand.getOpCode().ordinal()];
            if (i != 1) {
                if (i != 4) {
                    if ((VMCmdFlags.VM_CmdFlags[vMPreparedCommand.getOpCode().getVMCommand()] & VMCmdFlags.VMCF_CHFLAGS) != 0) {
                        for (int indexOf = cmd.indexOf(vMPreparedCommand) + 1; indexOf < cmd.size(); indexOf++) {
                            byte b = VMCmdFlags.VM_CmdFlags[cmd.get(indexOf).getOpCode().getVMCommand()];
                            if ((b & 56) == 0) {
                                if ((b & VMCmdFlags.VMCF_CHFLAGS) != 0) {
                                    break;
                                }
                            }
                        }
                        int i2 = AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands[vMPreparedCommand.getOpCode().ordinal()];
                        if (i2 != 7) {
                            if (i2 != 10) {
                                if (i2 != 15) {
                                    if (i2 != 18) {
                                        if (i2 == 39) {
                                            if (vMPreparedCommand.isByteMode()) {
                                                vMCommands = VMCommands.VM_NEGB;
                                            } else {
                                                vMCommands = VMCommands.VM_NEGD;
                                            }
                                            vMPreparedCommand.setOpCode(vMCommands);
                                        }
                                    } else {
                                        if (vMPreparedCommand.isByteMode()) {
                                            vMCommands2 = VMCommands.VM_DECB;
                                        } else {
                                            vMCommands2 = VMCommands.VM_DECD;
                                        }
                                        vMPreparedCommand.setOpCode(vMCommands2);
                                    }
                                } else {
                                    if (vMPreparedCommand.isByteMode()) {
                                        vMCommands3 = VMCommands.VM_INCB;
                                    } else {
                                        vMCommands3 = VMCommands.VM_INCD;
                                    }
                                    vMPreparedCommand.setOpCode(vMCommands3);
                                }
                            } else {
                                if (vMPreparedCommand.isByteMode()) {
                                    vMCommands4 = VMCommands.VM_SUBB;
                                } else {
                                    vMCommands4 = VMCommands.VM_SUBD;
                                }
                                vMPreparedCommand.setOpCode(vMCommands4);
                            }
                        } else {
                            if (vMPreparedCommand.isByteMode()) {
                                vMCommands5 = VMCommands.VM_ADDB;
                            } else {
                                vMCommands5 = VMCommands.VM_ADDD;
                            }
                            vMPreparedCommand.setOpCode(vMCommands5);
                        }
                    }
                } else {
                    if (vMPreparedCommand.isByteMode()) {
                        vMCommands6 = VMCommands.VM_CMPB;
                    } else {
                        vMCommands6 = VMCommands.VM_CMPD;
                    }
                    vMPreparedCommand.setOpCode(vMCommands6);
                }
            } else {
                if (vMPreparedCommand.isByteMode()) {
                    vMCommands7 = VMCommands.VM_MOVB;
                } else {
                    vMCommands7 = VMCommands.VM_MOVD;
                }
                vMPreparedCommand.setOpCode(vMCommands7);
            }
        }
    }

    private boolean setIP(int i) {
        if (i >= this.codeSize) {
            return true;
        }
        int i2 = this.maxOpCount - 1;
        this.maxOpCount = i2;
        if (i2 <= 0) {
            return false;
        }
        this.IP = i;
        return true;
    }

    private void setValue(boolean z, byte[] bArr, int i, int i2) {
        if (z) {
            if (isVMMem(bArr)) {
                bArr[i] = (byte) i2;
                return;
            }
            byte b = bArr[i];
            bArr[i] = (byte) (i2 & 255);
        } else if (isVMMem(bArr)) {
            Raw.writeIntLittleEndian(bArr, i, i2);
        } else {
            Raw.writeIntBigEndian(bArr, i, i2);
        }
    }

    public void execute(VMPreparedProgram vMPreparedProgram) {
        List<VMPreparedCommand> cmd;
        for (int i = 0; i < vMPreparedProgram.getInitR().length; i++) {
            this.R[i] = vMPreparedProgram.getInitR()[i];
        }
        long min = Math.min(vMPreparedProgram.getGlobalData().size(), 8192);
        if (min != 0) {
            for (int i2 = 0; i2 < min; i2++) {
                this.mem[i2 + VM_GLOBALMEMADDR] = vMPreparedProgram.getGlobalData().get(i2).byteValue();
            }
        }
        long min2 = Math.min(vMPreparedProgram.getStaticData().size(), 8192 - min);
        if (min2 != 0) {
            for (int i3 = 0; i3 < min2; i3++) {
                this.mem[((int) min) + VM_GLOBALMEMADDR + i3] = vMPreparedProgram.getStaticData().get(i3).byteValue();
            }
        }
        this.R[7] = 262144;
        this.flags = 0;
        if (vMPreparedProgram.getAltCmd().size() != 0) {
            cmd = vMPreparedProgram.getAltCmd();
        } else {
            cmd = vMPreparedProgram.getCmd();
        }
        if (!ExecuteCode(cmd, vMPreparedProgram.getCmdCount())) {
            cmd.get(0).setOpCode(VMCommands.VM_RET);
        }
        int value = getValue(false, this.mem, 245792) & VM_MEMMASK;
        int value2 = 262143 & getValue(false, this.mem, 245788);
        if (value + value2 >= 262144) {
            value = 0;
            value2 = 0;
        }
        vMPreparedProgram.setFilteredDataOffset(value);
        vMPreparedProgram.setFilteredDataSize(value2);
        vMPreparedProgram.getGlobalData().clear();
        int min3 = Math.min(getValue(false, this.mem, 245808), 8128);
        if (min3 != 0) {
            int i4 = min3 + 64;
            vMPreparedProgram.getGlobalData().setSize(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                vMPreparedProgram.getGlobalData().set(i5, Byte.valueOf(this.mem[i5 + VM_GLOBALMEMADDR]));
            }
        }
    }

    public byte[] getMem() {
        return this.mem;
    }

    public void init() {
        if (this.mem == null) {
            this.mem = new byte[262148];
        }
    }

    public void prepare(byte[] bArr, int i, VMPreparedProgram vMPreparedProgram) {
        int cmdCount;
        boolean z;
        InitBitInput();
        int min = Math.min(32768, i);
        for (int i2 = 0; i2 < min; i2++) {
            byte[] bArr2 = this.inBuf;
            bArr2[i2] = (byte) (bArr2[i2] | bArr[i2]);
        }
        byte b = 0;
        for (int i3 = 1; i3 < i; i3++) {
            b = (byte) (b ^ bArr[i3]);
        }
        faddbits(8);
        vMPreparedProgram.setCmdCount(0);
        if (b == bArr[0]) {
            VMStandardFilters IsStandardFilter = IsStandardFilter(bArr, i);
            if (IsStandardFilter != VMStandardFilters.VMSF_NONE) {
                VMPreparedCommand vMPreparedCommand = new VMPreparedCommand();
                vMPreparedCommand.setOpCode(VMCommands.VM_STANDARD);
                vMPreparedCommand.getOp1().setData(IsStandardFilter.getFilter());
                VMPreparedOperand op1 = vMPreparedCommand.getOp1();
                VMOpType vMOpType = VMOpType.VM_OPNONE;
                op1.setType(vMOpType);
                vMPreparedCommand.getOp2().setType(vMOpType);
                vMPreparedProgram.getCmd().add(vMPreparedCommand);
                vMPreparedProgram.setCmdCount(vMPreparedProgram.getCmdCount() + 1);
                i = 0;
            }
            int fgetbits = fgetbits();
            faddbits(1);
            if ((fgetbits & 32768) != 0) {
                ReadData(this);
                for (int i4 = 0; this.inAddr < i && i4 < 0; i4++) {
                    vMPreparedProgram.getStaticData().add(Byte.valueOf((byte) (fgetbits() >>> 8)));
                    faddbits(8);
                }
            }
            while (this.inAddr < i) {
                VMPreparedCommand vMPreparedCommand2 = new VMPreparedCommand();
                int fgetbits2 = fgetbits();
                if ((fgetbits2 & 32768) == 0) {
                    vMPreparedCommand2.setOpCode(VMCommands.findVMCommand(fgetbits2 >>> 12));
                    faddbits(4);
                } else {
                    vMPreparedCommand2.setOpCode(VMCommands.findVMCommand((fgetbits2 >>> 10) - 24));
                    faddbits(6);
                }
                if ((VMCmdFlags.VM_CmdFlags[vMPreparedCommand2.getOpCode().getVMCommand()] & 4) != 0) {
                    if ((fgetbits() >>> 15) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    vMPreparedCommand2.setByteMode(z);
                    faddbits(1);
                } else {
                    vMPreparedCommand2.setByteMode(false);
                }
                VMPreparedOperand op12 = vMPreparedCommand2.getOp1();
                VMOpType vMOpType2 = VMOpType.VM_OPNONE;
                op12.setType(vMOpType2);
                vMPreparedCommand2.getOp2().setType(vMOpType2);
                int i5 = VMCmdFlags.VM_CmdFlags[vMPreparedCommand2.getOpCode().getVMCommand()] & 3;
                if (i5 > 0) {
                    decodeArg(vMPreparedCommand2.getOp1(), vMPreparedCommand2.isByteMode());
                    if (i5 == 2) {
                        decodeArg(vMPreparedCommand2.getOp2(), vMPreparedCommand2.isByteMode());
                    } else if (vMPreparedCommand2.getOp1().getType() == VMOpType.VM_OPINT && (VMCmdFlags.VM_CmdFlags[vMPreparedCommand2.getOpCode().getVMCommand()] & 24) != 0) {
                        int data = vMPreparedCommand2.getOp1().getData();
                        if (data >= 256) {
                            cmdCount = data - 256;
                        } else {
                            if (data >= 136) {
                                data -= 264;
                            } else if (data >= 16) {
                                data -= 8;
                            } else if (data >= 8) {
                                data -= 16;
                            }
                            cmdCount = data + vMPreparedProgram.getCmdCount();
                        }
                        vMPreparedCommand2.getOp1().setData(cmdCount);
                    }
                }
                vMPreparedProgram.setCmdCount(vMPreparedProgram.getCmdCount() + 1);
                vMPreparedProgram.getCmd().add(vMPreparedCommand2);
            }
        }
        VMPreparedCommand vMPreparedCommand3 = new VMPreparedCommand();
        vMPreparedCommand3.setOpCode(VMCommands.VM_RET);
        VMPreparedOperand op13 = vMPreparedCommand3.getOp1();
        VMOpType vMOpType3 = VMOpType.VM_OPNONE;
        op13.setType(vMOpType3);
        vMPreparedCommand3.getOp2().setType(vMOpType3);
        vMPreparedProgram.getCmd().add(vMPreparedCommand3);
        vMPreparedProgram.setCmdCount(vMPreparedProgram.getCmdCount() + 1);
        if (i != 0) {
            optimize(vMPreparedProgram);
        }
    }

    public void setLowEndianValue(Vector<Byte> vector, int i, int i2) {
        vector.set(i, Byte.valueOf((byte) (i2 & 255)));
        vector.set(i + 1, Byte.valueOf((byte) ((i2 >>> 8) & 255)));
        vector.set(i + 2, Byte.valueOf((byte) ((i2 >>> 16) & 255)));
        vector.set(i + 3, Byte.valueOf((byte) ((i2 >>> 24) & 255)));
    }

    public void setMemory(int i, byte[] bArr, int i2, int i3) {
        if (i < 262144) {
            for (int i4 = 0; i4 < Math.min(bArr.length - i2, i3) && 262144 - i >= i4; i4++) {
                this.mem[i + i4] = bArr[i2 + i4];
            }
        }
    }

    public void setLowEndianValue(byte[] bArr, int i, int i2) {
        Raw.writeIntLittleEndian(bArr, i, i2);
    }
}
