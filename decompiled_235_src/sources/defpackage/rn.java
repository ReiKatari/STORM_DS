package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rn  reason: default package */
/* loaded from: classes.dex */
public final class rn implements e34 {
    public final yn a;

    public rn(yn ynVar) {
        this.a = ynVar;
    }

    @Override // defpackage.e34
    public final int a(eb3 eb3Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((x24) list.get(0)).u(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((x24) list.get(i2)).u(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.e34
    public final f34 d(g34 g34Var, List list, long j) {
        dx4 dx4Var;
        int i;
        dx4 dx4Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int size = list.size();
        dx4[] dx4VarArr = new dx4[size];
        int size2 = list.size();
        long j2 = 0;
        int i8 = 0;
        while (true) {
            dx4Var = null;
            tn tnVar = null;
            i = 1;
            if (i8 >= size2) {
                break;
            }
            x24 x24Var = (x24) list.get(i8);
            Object B = x24Var.B();
            if (B instanceof tn) {
                tnVar = (tn) B;
            }
            if (tnVar != null && ((Boolean) tnVar.a.getValue()).booleanValue()) {
                dx4 y = x24Var.y(j);
                int i9 = y.A;
                dx4VarArr[i8] = y;
                j2 = (y.B & 4294967295L) | (i9 << 32);
            }
            i8++;
        }
        int size3 = list.size();
        for (int i10 = 0; i10 < size3; i10++) {
            x24 x24Var2 = (x24) list.get(i10);
            if (dx4VarArr[i10] == null) {
                dx4VarArr[i10] = x24Var2.y(j);
            }
        }
        if (g34Var.a0()) {
            i4 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                dx4Var2 = null;
            } else {
                dx4Var2 = dx4VarArr[0];
                int i11 = size - 1;
                if (i11 != 0) {
                    if (dx4Var2 != null) {
                        i2 = dx4Var2.A;
                    } else {
                        i2 = 0;
                    }
                    if (1 <= i11) {
                        int i12 = 1;
                        while (true) {
                            dx4 dx4Var3 = dx4VarArr[i12];
                            if (dx4Var3 != null) {
                                i3 = dx4Var3.A;
                            } else {
                                i3 = 0;
                            }
                            if (i2 < i3) {
                                dx4Var2 = dx4Var3;
                                i2 = i3;
                            }
                            if (i12 == i11) {
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            if (dx4Var2 != null) {
                i4 = dx4Var2.A;
            } else {
                i4 = 0;
            }
        }
        if (g34Var.a0()) {
            i5 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                dx4Var = dx4VarArr[0];
                int i13 = size - 1;
                if (i13 != 0) {
                    if (dx4Var != null) {
                        i6 = dx4Var.B;
                    } else {
                        i6 = 0;
                    }
                    if (1 <= i13) {
                        while (true) {
                            dx4 dx4Var4 = dx4VarArr[i];
                            if (dx4Var4 != null) {
                                i7 = dx4Var4.B;
                            } else {
                                i7 = 0;
                            }
                            if (i6 < i7) {
                                dx4Var = dx4Var4;
                                i6 = i7;
                            }
                            if (i == i13) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            if (dx4Var != null) {
                i5 = dx4Var.B;
            } else {
                i5 = 0;
            }
        }
        if (!g34Var.a0()) {
            this.a.c.setValue(new q93((i4 << 32) | (i5 & 4294967295L)));
        }
        return g34Var.K(i4, i5, zt1.A, new qn(dx4VarArr, this, i4, i5));
    }

    @Override // defpackage.e34
    public final int e(eb3 eb3Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((x24) list.get(0)).n(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((x24) list.get(i2)).n(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.e34
    public final int g(eb3 eb3Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((x24) list.get(0)).c(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((x24) list.get(i2)).c(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.e34
    public final int i(eb3 eb3Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((x24) list.get(0)).V(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((x24) list.get(i2)).V(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }
}
