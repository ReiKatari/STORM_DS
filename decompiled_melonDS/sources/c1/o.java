package c1;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements y3.v0 {

    /* renamed from: a  reason: collision with root package name */
    public final v f2485a;

    public o(v vVar) {
        this.f2485a = vVar;
    }

    @Override // y3.v0
    public final y3.w0 a(y3.x0 x0Var, List list, long j2) {
        y3.i1 i1Var;
        int i2;
        y3.i1 i1Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int size = list.size();
        y3.i1[] i1VarArr = new y3.i1[size];
        int size2 = list.size();
        long j10 = 0;
        int i16 = 0;
        while (true) {
            i1Var = null;
            q qVar = null;
            i2 = 1;
            if (i16 >= size2) {
                break;
            }
            y3.u0 u0Var = (y3.u0) list.get(i16);
            Object n10 = u0Var.n();
            if (n10 instanceof q) {
                qVar = (q) n10;
            }
            if (qVar != null && ((Boolean) qVar.f2505a.getValue()).booleanValue()) {
                y3.i1 e6 = u0Var.e(j2);
                int i17 = e6.A;
                i1VarArr[i16] = e6;
                j10 = (e6.B & 4294967295L) | (i17 << 32);
            }
            i16++;
        }
        int size3 = list.size();
        for (int i18 = 0; i18 < size3; i18++) {
            y3.u0 u0Var2 = (y3.u0) list.get(i18);
            if (i1VarArr[i18] == null) {
                i1VarArr[i18] = u0Var2.e(j2);
            }
        }
        if (x0Var.q()) {
            i12 = (int) (j10 >> 32);
        } else {
            if (size == 0) {
                i1Var2 = null;
            } else {
                i1Var2 = i1VarArr[0];
                int i19 = size - 1;
                if (i19 != 0) {
                    if (i1Var2 != null) {
                        i10 = i1Var2.A;
                    } else {
                        i10 = 0;
                    }
                    if (1 <= i19) {
                        int i20 = 1;
                        while (true) {
                            y3.i1 i1Var3 = i1VarArr[i20];
                            if (i1Var3 != null) {
                                i11 = i1Var3.A;
                            } else {
                                i11 = 0;
                            }
                            if (i10 < i11) {
                                i1Var2 = i1Var3;
                                i10 = i11;
                            }
                            if (i20 == i19) {
                                break;
                            }
                            i20++;
                        }
                    }
                }
            }
            if (i1Var2 != null) {
                i12 = i1Var2.A;
            } else {
                i12 = 0;
            }
        }
        if (x0Var.q()) {
            i13 = (int) (j10 & 4294967295L);
        } else {
            if (size != 0) {
                i1Var = i1VarArr[0];
                int i21 = size - 1;
                if (i21 != 0) {
                    if (i1Var != null) {
                        i14 = i1Var.B;
                    } else {
                        i14 = 0;
                    }
                    if (1 <= i21) {
                        while (true) {
                            y3.i1 i1Var4 = i1VarArr[i2];
                            if (i1Var4 != null) {
                                i15 = i1Var4.B;
                            } else {
                                i15 = 0;
                            }
                            if (i14 < i15) {
                                i1Var = i1Var4;
                                i14 = i15;
                            }
                            if (i2 == i21) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            if (i1Var != null) {
                i13 = i1Var.B;
            } else {
                i13 = 0;
            }
        }
        if (!x0Var.q()) {
            this.f2485a.f2534c.setValue(new x4.l((i12 << 32) | (i13 & 4294967295L)));
        }
        return x0Var.u0(i12, i13, zb.r.A, new n(i1VarArr, this, i12, i13));
    }

    @Override // y3.v0
    public final int c(y3.v vVar, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((y3.u0) list.get(0)).h0(i2));
            int i10 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((y3.u0) list.get(i10)).h0(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // y3.v0
    public final int d(y3.v vVar, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((y3.u0) list.get(0)).g0(i2));
            int i10 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((y3.u0) list.get(i10)).g0(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // y3.v0
    public final int g(y3.v vVar, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((y3.u0) list.get(0)).b0(i2));
            int i10 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((y3.u0) list.get(i10)).b0(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // y3.v0
    public final int j(y3.v vVar, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((y3.u0) list.get(0)).g(i2));
            int i10 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((y3.u0) list.get(i10)).g(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }
}
