package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fn  reason: default package */
/* loaded from: classes.dex */
public final class fn implements tv3 {
    public final mn a;

    public fn(mn mnVar) {
        this.a = mnVar;
    }

    @Override // defpackage.tv3
    public final int a(s43 s43Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((mv3) list.get(0)).f(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((mv3) list.get(i2)).f(i));
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

    @Override // defpackage.tv3
    public final int b(s43 s43Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((mv3) list.get(0)).e0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((mv3) list.get(i2)).e0(i));
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

    @Override // defpackage.tv3
    public final uv3 f(vv3 vv3Var, List list, long j) {
        yn4 yn4Var;
        int i;
        yn4 yn4Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int size = list.size();
        yn4[] yn4VarArr = new yn4[size];
        int size2 = list.size();
        long j2 = 0;
        int i8 = 0;
        while (true) {
            yn4Var = null;
            hn hnVar = null;
            i = 1;
            if (i8 >= size2) {
                break;
            }
            mv3 mv3Var = (mv3) list.get(i8);
            Object l = mv3Var.l();
            if (l instanceof hn) {
                hnVar = (hn) l;
            }
            if (hnVar != null && ((Boolean) hnVar.a.getValue()).booleanValue()) {
                yn4 c = mv3Var.c(j);
                int i9 = c.A;
                yn4VarArr[i8] = c;
                j2 = (c.B & 4294967295L) | (i9 << 32);
            }
            i8++;
        }
        int size3 = list.size();
        for (int i10 = 0; i10 < size3; i10++) {
            mv3 mv3Var2 = (mv3) list.get(i10);
            if (yn4VarArr[i10] == null) {
                yn4VarArr[i10] = mv3Var2.c(j);
            }
        }
        if (vv3Var.w()) {
            i4 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                yn4Var2 = null;
            } else {
                yn4Var2 = yn4VarArr[0];
                int i11 = size - 1;
                if (i11 != 0) {
                    if (yn4Var2 != null) {
                        i2 = yn4Var2.A;
                    } else {
                        i2 = 0;
                    }
                    if (1 <= i11) {
                        int i12 = 1;
                        while (true) {
                            yn4 yn4Var3 = yn4VarArr[i12];
                            if (yn4Var3 != null) {
                                i3 = yn4Var3.A;
                            } else {
                                i3 = 0;
                            }
                            if (i2 < i3) {
                                yn4Var2 = yn4Var3;
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
            if (yn4Var2 != null) {
                i4 = yn4Var2.A;
            } else {
                i4 = 0;
            }
        }
        if (vv3Var.w()) {
            i5 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                yn4Var = yn4VarArr[0];
                int i13 = size - 1;
                if (i13 != 0) {
                    if (yn4Var != null) {
                        i6 = yn4Var.B;
                    } else {
                        i6 = 0;
                    }
                    if (1 <= i13) {
                        while (true) {
                            yn4 yn4Var4 = yn4VarArr[i];
                            if (yn4Var4 != null) {
                                i7 = yn4Var4.B;
                            } else {
                                i7 = 0;
                            }
                            if (i6 < i7) {
                                yn4Var = yn4Var4;
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
            if (yn4Var != null) {
                i5 = yn4Var.B;
            } else {
                i5 = 0;
            }
        }
        if (!vv3Var.w()) {
            this.a.c.setValue(new i33((i4 << 32) | (i5 & 4294967295L)));
        }
        return vv3Var.s0(i4, i5, qp1.A, new en(yn4VarArr, this, i4, i5));
    }

    @Override // defpackage.tv3
    public final int g(s43 s43Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((mv3) list.get(0)).g0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((mv3) list.get(i2)).g0(i));
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

    @Override // defpackage.tv3
    public final int i(s43 s43Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((mv3) list.get(0)).T(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((mv3) list.get(i2)).T(i));
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
