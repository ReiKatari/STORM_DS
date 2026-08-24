package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mu6  reason: default package */
/* loaded from: classes.dex */
public final class mu6 implements e36 {
    public final vm2 A;

    public mu6(vm2 vm2Var) {
        vm2Var.getClass();
        this.A = vm2Var;
    }

    @Override // defpackage.e36
    public final boolean Y() {
        return this.A.Y();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00be, code lost:
        if (r2.equals("END") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c7, code lost:
        if (r2.equals("COM") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ca, code lost:
        r4 = defpackage.su6.END;
     */
    @Override // defpackage.e36
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j36 i0(String str) {
        String str2;
        su6 su6Var;
        int i;
        str.getClass();
        vm2 vm2Var = this.A;
        d90 d90Var = null;
        if (vm2Var.isOpen()) {
            String upperCase = qs6.T0(str).toString().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int length = upperCase.length() - 2;
            int i2 = -1;
            if (length >= 0) {
                int i3 = 0;
                loop0: while (i3 < length) {
                    char charAt = upperCase.charAt(i3);
                    if (nb3.p(charAt, 32) > 0) {
                        if (charAt == '-') {
                            if (upperCase.charAt(i3 + 1) == '-') {
                                i3 = qs6.s0('\n', i3 + 2, 4, upperCase);
                                if (i3 < 0) {
                                    break;
                                }
                            } else {
                                i2 = i3;
                                break;
                            }
                        } else {
                            if (charAt == '/') {
                                int i4 = i3 + 1;
                                if (upperCase.charAt(i4) == '*') {
                                    do {
                                        i4 = qs6.s0('*', i4 + 1, 4, upperCase);
                                        if (i4 >= 0) {
                                            i = i4 + 1;
                                            if (i >= length) {
                                                break;
                                            }
                                        } else {
                                            break loop0;
                                        }
                                    } while (upperCase.charAt(i) != '/');
                                    i3 = i4 + 2;
                                }
                            }
                            i2 = i3;
                            break;
                        }
                    }
                    i3++;
                }
            }
            if (i2 >= 0 && i2 <= upperCase.length()) {
                str2 = upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
            } else {
                str2 = null;
            }
            if (str2 == null) {
                return new tu6(vm2Var, str);
            }
            switch (str2.hashCode()) {
                case 65636:
                    if (str2.equals("BEG")) {
                        if (qs6.j0(upperCase, "EXCLUSIVE", false)) {
                            su6Var = su6.BEGIN_EXCLUSIVE;
                            break;
                        } else if (qs6.j0(upperCase, "IMMEDIATE", false)) {
                            su6Var = su6.BEGIN_IMMEDIATE;
                            break;
                        } else {
                            su6Var = su6.BEGIN_DEFERRED;
                            break;
                        }
                    }
                    su6Var = null;
                    break;
                case 66913:
                    break;
                case 68795:
                    break;
                case 81327:
                    if (str2.equals("ROL") && !qs6.j0(upperCase, " TO ", false)) {
                        su6Var = su6.ROLLBACK;
                        break;
                    }
                    su6Var = null;
                    break;
                default:
                    su6Var = null;
                    break;
            }
            if (su6Var != null) {
                return new tu6(vm2Var, str, su6Var);
            }
            if (str2.equals("PRA")) {
                String lowerCase = upperCase.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (qs6.j0(qs6.N0(lowerCase, "journal_mode", ""), "=", false)) {
                    d90Var = d90.E0;
                }
            }
            if (d90Var != null) {
                return new tu6(vm2Var, str, new uu6(vm2Var, str));
            }
            int hashCode = str2.hashCode();
            if (hashCode == 79487 ? str2.equals("PRA") : !(hashCode == 81978 ? !str2.equals("SEL") : !(hashCode == 85954 && str2.equals("WIT")))) {
                return new uu6(vm2Var, str);
            }
            return new tu6(vm2Var, str);
        }
        ii2.T(21, "connection is closed");
        throw null;
    }
}
