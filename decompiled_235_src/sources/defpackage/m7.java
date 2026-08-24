package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m7  reason: default package */
/* loaded from: classes.dex */
public final class m7 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public int Z;
    public Object d0;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(le2[] le2VarArr, int i, AtomicInteger atomicInteger, v80 v80Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 1;
        this.d0 = le2VarArr;
        this.Z = i;
        this.e0 = atomicInteger;
        this.f0 = v80Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((m7) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((m7) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((m7) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((m7) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.f0;
        Object obj3 = this.e0;
        switch (i) {
            case 0:
                m7 m7Var = new m7((pr3) obj3, (gn) obj2, this.Z, r41Var);
                m7Var.d0 = obj;
                return m7Var;
            case 1:
                return new m7((le2[]) this.d0, this.Z, (AtomicInteger) obj3, (v80) obj2, r41Var);
            case 2:
                return new m7((sz1) obj3, (c46) obj2, r41Var, 2);
            default:
                return new m7((tz5) obj3, (ArrayList) obj2, r41Var, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ab, code lost:
        if (defpackage.lv2.c(r14) == r12) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r5 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        if (r9 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
        if (r5 == r0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #2 {all -> 0x007f, blocks: (B:20:0x0050, B:22:0x0056, B:19:0x004a), top: B:128:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[DONT_GENERATE] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x01ab -> B:106:0x01ae). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0073 -> B:26:0x0077). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object obj2;
        kr3 kr3Var;
        Object obj3;
        dy1 dy1Var;
        Object A0;
        sz1 sz1Var;
        Enum i;
        Iterator it;
        Enum f;
        int i2 = this.X;
        int i3 = 0;
        Object obj4 = this.e0;
        jg7 jg7Var = jg7.a;
        Object obj5 = this.f0;
        switch (i2) {
            case 0:
                int i4 = this.Z;
                pr3 pr3Var = (pr3) obj4;
                w61 w61Var = (w61) this.d0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2 && i5 != 3) {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    oi2.Y(obj);
                    Iterator it2 = pr3Var.j().k.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (((kr3) obj3).a == i4) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    kr3Var = (kr3) obj3;
                    if (kr3Var != null) {
                        this.d0 = null;
                        this.Y = 1;
                        break;
                    } else {
                        int i6 = kr3Var.m;
                        int i7 = (((Number) ((gn) obj5).d()).floatValue() > (-1.0f) ? 1 : (((Number) ((gn) obj5).d()).floatValue() == (-1.0f) ? 0 : -1));
                        gn gnVar = (gn) obj5;
                        if (i7 == 0) {
                            Float f2 = new Float(i6);
                            this.d0 = null;
                            this.Y = 2;
                            if (gnVar.e(this, f2) != x61Var) {
                                return jg7Var;
                            }
                        } else {
                            Float f3 = new Float(i6);
                            this.d0 = null;
                            this.Y = 3;
                            if (gn.c(gnVar, f3, null, null, this, 14) != x61Var) {
                                return jg7Var;
                            }
                        }
                    }
                    return x61Var;
                }
                oi2.Y(obj);
                hv.L(w61Var, null, null, new l7(pr3Var, i4, null, 0), 3);
                Iterator it3 = pr3Var.j().k.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (((kr3) obj2).a == i4) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                kr3Var = (kr3) obj2;
                if (kr3Var != null) {
                }
                return x61Var;
            case 1:
                AtomicInteger atomicInteger = (AtomicInteger) obj4;
                v80 v80Var = (v80) obj5;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                try {
                    if (i8 != 0) {
                        if (i8 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        int i9 = this.Z;
                        le2 le2Var = ((le2[]) this.d0)[i9];
                        bu0 bu0Var = new bu0(v80Var, i9);
                        this.Y = 1;
                        if (le2Var.b(bu0Var, this) == x61Var2) {
                            return x61Var2;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        v80Var.i(null);
                        return jg7Var;
                    }
                    return jg7Var;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        v80Var.i(null);
                    }
                }
            case 2:
                sz1 sz1Var2 = (sz1) obj4;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Z;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                dy1 dy1Var2 = (dy1) ((sz1) this.d0);
                                oi2.Y(obj);
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = this.Y;
                        sz1Var = (sz1) this.d0;
                        oi2.Y(obj);
                        sz1Var2 = sz1Var;
                        this.d0 = null;
                        this.Y = i3;
                        this.Z = 3;
                        sz1Var2.U0();
                        if (jg7Var != x61Var3) {
                            return jg7Var;
                        }
                        return x61Var3;
                    }
                    i3 = this.Y;
                    sz1Var2 = (sz1) this.d0;
                    oi2.Y(obj);
                    A0 = obj;
                } else {
                    oi2.Y(obj);
                    Object value = sz1Var2.p0.getValue();
                    if (value instanceof dy1) {
                        dy1Var = (dy1) value;
                    } else {
                        dy1Var = null;
                    }
                    if (dy1Var != null) {
                        pq5 pq5Var = dy1Var.a;
                        this.d0 = sz1Var2;
                        this.Y = 0;
                        this.Z = 1;
                        A0 = sz1Var2.A0(pq5Var, (c46) obj5, this);
                        break;
                    } else {
                        return jg7Var;
                    }
                }
                if (!((Boolean) A0).booleanValue()) {
                    of6 of6Var = sz1Var2.J0;
                    this.d0 = sz1Var2;
                    this.Y = i3;
                    this.Z = 2;
                    if (of6Var.a(u77.a, this) != x61Var3) {
                        sz1Var = sz1Var2;
                        sz1Var2 = sz1Var;
                    }
                    return x61Var3;
                }
                this.d0 = null;
                this.Y = i3;
                this.Z = 3;
                sz1Var2.U0();
                if (jg7Var != x61Var3) {
                }
                return x61Var3;
            default:
                tz5 tz5Var = (tz5) obj4;
                fg fgVar = tz5Var.g;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i11 = this.Z;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            i3 = this.Y;
                            it = (Iterator) this.d0;
                            try {
                                oi2.Y(obj);
                                f = obj;
                            } catch (Throwable unused) {
                            }
                            if (((t33) f) == t33.SUCCESS) {
                                i3 = 1;
                            }
                            if (!it.hasNext()) {
                                pq5 pq5Var2 = (pq5) it.next();
                                tz5Var.K.add(pq5Var2.d.toString());
                                Uri uri = pq5Var2.d;
                                this.d0 = it;
                                this.Y = i3;
                                this.Z = 2;
                                f = fgVar.f(uri, this);
                                break;
                            } else if (i3 != 0) {
                                tz5Var.p();
                                return jg7Var;
                            } else {
                                return jg7Var;
                            }
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        i = obj;
                    }
                } else {
                    oi2.Y(obj);
                    this.Z = 1;
                    i = fgVar.i(this);
                    break;
                }
                if (!((mm4) i).isFailure()) {
                    try {
                        it = ((ArrayList) obj5).iterator();
                        if (!it.hasNext()) {
                        }
                    } finally {
                        fgVar.b();
                    }
                } else {
                    return jg7Var;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(qo7 qo7Var, Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.e0 = qo7Var;
        this.f0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(pr3 pr3Var, gn gnVar, int i, r41 r41Var) {
        super(2, r41Var);
        this.X = 0;
        this.e0 = pr3Var;
        this.f0 = gnVar;
        this.Z = i;
    }
}
