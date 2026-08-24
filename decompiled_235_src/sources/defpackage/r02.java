package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r02  reason: default package */
/* loaded from: classes.dex */
public final class r02 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ sz1 Z;
    public boolean d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r02(sz1 sz1Var, boolean z, r41 r41Var) {
        super(2, r41Var);
        this.Z = sz1Var;
        this.d0 = z;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((r02) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((r02) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        sz1 sz1Var = this.Z;
        switch (i) {
            case 0:
                return new r02(sz1Var, r41Var);
            default:
                return new r02(sz1Var, this.d0, r41Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r10 == r13) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r5 == r13) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0167, code lost:
        if (r4 == r3) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0194, code lost:
        if (r2 == r3) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object D;
        boolean k;
        Object d0;
        Object D2;
        Map map;
        of6 of6Var;
        sy1 sy1Var;
        boolean z;
        int i = this.X;
        int i2 = 5;
        int i3 = 4;
        sz1 sz1Var = this.Z;
        jg7 jg7Var = jg7.a;
        t52 t52Var = null;
        switch (i) {
            case 0:
                of6 of6Var2 = sz1Var.J0;
                kd6 kd6Var = sz1Var.c;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                k77 k77Var = k77.a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4 && i4 != 5) {
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                boolean z2 = this.d0;
                                oi2.Y(obj);
                                k = z2;
                                d0 = obj;
                                ak5 ak5Var = (ak5) d0;
                                if (ak5Var.b) {
                                    l77 l77Var = new l77(ak5Var.a);
                                    this.d0 = k;
                                    this.Y = 4;
                                    if (of6Var2.a(l77Var, this) != x61Var) {
                                        return jg7Var;
                                    }
                                } else {
                                    this.d0 = k;
                                    this.Y = 5;
                                    if (of6Var2.a(k77Var, this) != x61Var) {
                                        return jg7Var;
                                    }
                                }
                                return x61Var;
                            }
                        }
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    oi2.Y(obj);
                    D = obj;
                } else {
                    oi2.Y(obj);
                    wp0 C = ((ng6) kd6Var).C();
                    this.Y = 1;
                    D = f04.D(C, this);
                    break;
                }
                k = nb3.k(D, Boolean.TRUE);
                if (!k) {
                    this.d0 = k;
                    this.Y = 2;
                    if (of6Var2.a(k77Var, this) != x61Var) {
                        return jg7Var;
                    }
                } else {
                    VideoRenderer e = ((ng6) kd6Var).e();
                    xe1 xe1Var = xk1.a;
                    y3 y3Var = new y3(e, (r41) null, 10);
                    this.d0 = k;
                    this.Y = 3;
                    d0 = hv.d0(xe1Var, y3Var, this);
                    break;
                }
                return x61Var;
            default:
                tp6 tp6Var = sz1Var.p0;
                kd6 kd6Var2 = sz1Var.c;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                oi2.Y(obj);
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        D2 = obj;
                        boolean k2 = nb3.k(D2, Boolean.TRUE);
                        hy1 hy1Var = (hy1) tp6Var.getValue();
                        if (hy1Var instanceof dy1) {
                            t52 entries = xz5.getEntries();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : entries) {
                                sx1 sx1Var = sz1Var.w;
                                int i6 = wz1.d[((xz5) obj2).ordinal()];
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        if (i6 != i3) {
                                            if (i6 != i2) {
                                                if (i6 != 7) {
                                                    if (i6 != 8) {
                                                        if (i6 == 10) {
                                                            z = k2;
                                                        }
                                                    } else {
                                                        z = sz1Var.f0().a;
                                                    }
                                                } else {
                                                    z = sx1Var.b;
                                                }
                                            } else if (!((ng6) kd6Var2).b.getBoolean("enable_rewind", false) || !sx1Var.b()) {
                                                z = false;
                                            }
                                        } else {
                                            z = sx1Var.b();
                                        }
                                    } else {
                                        sx1Var.getClass();
                                    }
                                    z = true;
                                } else {
                                    z = tp6Var.getValue() instanceof dy1;
                                }
                                if (z) {
                                    arrayList.add(obj2);
                                }
                                i2 = 5;
                                i3 = 4;
                            }
                            t52Var = arrayList;
                        } else if (hy1Var instanceof cy1) {
                            t52Var = cd2.getEntries();
                        }
                        if (t52Var != null) {
                            cd5 f0 = sz1Var.f0();
                            String str = f0.c;
                            if (f0.a && str != null) {
                                xz5 xz5Var = xz5.SYNC_RETRO_ACHIEVEMENTS;
                                if (t52Var.contains(xz5Var)) {
                                    map = Collections.singletonMap(xz5Var, str);
                                    map.getClass();
                                    of6Var = sz1Var.T0;
                                    sy1Var = new sy1(new mu4(map, t52Var));
                                    this.Y = 3;
                                    if (of6Var.a(sy1Var, this) != x61Var2) {
                                        return jg7Var;
                                    }
                                    return x61Var2;
                                }
                            }
                            map = zt1.A;
                            of6Var = sz1Var.T0;
                            sy1Var = new sy1(new mu4(map, t52Var));
                            this.Y = 3;
                            if (of6Var.a(sy1Var, this) != x61Var2) {
                            }
                            return x61Var2;
                        }
                        return jg7Var;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    jh jhVar = sz1Var.v;
                    this.Y = 1;
                    jhVar.getClass();
                    jh.i();
                    break;
                }
                if (this.d0) {
                    wp0 C2 = ((ng6) kd6Var2).C();
                    this.Y = 2;
                    D2 = f04.D(C2, this);
                    break;
                } else {
                    return jg7Var;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r02(sz1 sz1Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = sz1Var;
    }
}
