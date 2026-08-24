package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kp5  reason: default package */
/* loaded from: classes.dex */
public final class kp5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public Object d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp5(Object obj, Object obj2, Object obj3, Object obj4, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
        this.e0 = obj3;
        this.f0 = obj4;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((kp5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((kp5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((kp5) q((r41) obj2, (q35) obj)).s(jg7Var);
            case 3:
                return ((kp5) q((r41) obj2, (q35) obj)).s(jg7Var);
            case 4:
                return ((kp5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 5:
                return ((kp5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 6:
                return ((kp5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 7:
                return ((kp5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 8:
                return ((kp5) q((r41) obj2, (ne2) obj)).s(jg7Var);
            case 9:
                return ((kp5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 10:
                return ((kp5) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 11:
                return ((kp5) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((kp5) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.f0;
        switch (i) {
            case 0:
                return new kp5((mp5) this.d0, (String) this.e0, (gd0) obj2, r41Var, 0);
            case 1:
                return new kp5((ss5) this.Z, (ip3) this.d0, (pr3) this.e0, (om6) obj2, r41Var, 1);
            case 2:
                kp5 kp5Var = new kp5((RomDetailsActivity) this.e0, (qa4) obj2, r41Var, 2);
                kp5Var.d0 = obj;
                return kp5Var;
            case 3:
                kp5 kp5Var2 = new kp5((RomDetailsActivity) this.e0, (pq5) obj2, r41Var, 3);
                kp5Var2.d0 = obj;
                return kp5Var2;
            case 4:
                kp5 kp5Var3 = new kp5((m16) this.d0, (rj0) this.e0, (w81) obj2, r41Var, 4);
                kp5Var3.Z = obj;
                return kp5Var3;
            case 5:
                kp5 kp5Var4 = new kp5((qn2) this.d0, (AtomicReference) this.e0, (eo2) obj2, r41Var, 5);
                kp5Var4.Z = obj;
                return kp5Var4;
            case 6:
                return new kp5((dd) this.Z, (qa4) this.d0, (qa4) this.e0, (qa4) obj2, r41Var, 6);
            case 7:
                kp5 kp5Var5 = new kp5((z87) obj2, r41Var);
                kp5Var5.e0 = obj;
                return kp5Var5;
            case 8:
                kp5 kp5Var6 = new kp5((nc7) this.d0, (int[]) this.e0, (String[]) obj2, r41Var, 8);
                kp5Var6.Z = obj;
                return kp5Var6;
            case 9:
                return new kp5((ri7) this.Z, (ki7) this.d0, (Map) this.e0, (xy0) obj2, r41Var, 9);
            case 10:
                return new kp5((qa4) this.d0, (gl6) this.e0, (qr7) obj2, r41Var, 10);
            case 11:
                return new kp5((dh5) this.Z, (if5) this.d0, (hu3) this.e0, (tv7) obj2, r41Var, 11);
            default:
                return new kp5((nx3) this.Z, (yw7) this.d0, (fw7) this.e0, (Context) obj2, r41Var, 12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0236, code lost:
        if (r10 == r4) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0267, code lost:
        if (r10.l(r11, r24) != r4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r4 == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03b8, code lost:
        if (defpackage.yh2.n(r3, r24) == r2) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0538, code lost:
        if (defpackage.pr3.l(r2, 0, r24) == r10) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0545, code lost:
        if (defpackage.ip3.j(r1, 0, r24) == r10) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0552, code lost:
        if (defpackage.nw7.q0(r4, r1, r2, (defpackage.om6) r24.f0, r24) == r10) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x059a, code lost:
        if (r3 == r2) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x05cf, code lost:
        if (r0 == r2) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:?, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:?, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0192, code lost:
        if (r2 == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
        if (((defpackage.jg1) r2).X(r24) == r1) goto L80;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0283 A[Catch: all -> 0x0295, TryCatch #4 {all -> 0x0295, blocks: (B:125:0x027f, B:127:0x0283, B:129:0x0291, B:132:0x0297, B:134:0x029c, B:136:0x02a0), top: B:330:0x027f }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03e6  */
    /* JADX WARN: Type inference failed for: r0v36, types: [r41] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [dh5, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x031b -> B:157:0x02e5). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object b;
        vd vdVar;
        Object C;
        uz uzVar;
        Object em5Var;
        Object e;
        Object em5Var2;
        Object e2;
        rj0 rj0Var;
        Object d0;
        vc6 vc6Var;
        vc6 vc6Var2;
        Object o;
        w61 w61Var;
        z87 z87Var;
        Object obj2;
        w61 w61Var2;
        m86 m86Var;
        ne2 ne2Var;
        long j;
        boolean z;
        l61 l61Var;
        ne2 ne2Var2;
        Throwable th;
        di4 di4Var;
        ReentrantLock reentrantLock;
        boolean z2;
        Object k;
        qr7 qr7Var;
        Object value;
        Object a;
        Object obj3 = null;
        switch (this.X) {
            case 0:
                String str = (String) this.e0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            vdVar = (vd) this.Z;
                            C = obj;
                            oh0 oh0Var = (oh0) C;
                            if (oh0Var instanceof vh0) {
                                Log.i("CXCP", ((Object) xf0.b(str)) + " opened successfully.");
                                return new uz(((vh0) oh0Var).a, vdVar);
                            }
                            Log.e("CXCP", "Failed to open " + ((Object) xf0.b(str)) + '!');
                            uzVar = new uz(null, null);
                            return uzVar;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    b = obj;
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    b = ((mp5) this.d0).b(str, (gd0) this.f0, new gn5(7), this);
                    break;
                }
                vdVar = ((lm4) b).a;
                if (vdVar == null) {
                    Log.e("CXCP", "Failed to open " + ((Object) xf0.b(str)) + '!');
                    uzVar = new uz(null, null);
                    return uzVar;
                }
                tp6 tp6Var = vdVar.u;
                m8 m8Var = new m8(2, null, 7);
                this.Z = vdVar;
                this.Y = 2;
                C = f04.C(tp6Var, m8Var, this);
                break;
            case 1:
                ip3 ip3Var = (ip3) this.d0;
                pr3 pr3Var = (pr3) this.e0;
                ss5 ss5Var = (ss5) this.Z;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 == 3) {
                            oi2.Y(obj);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    int i3 = ms5.a[ss5Var.f.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            this.Y = 2;
                            break;
                        } else {
                            i.d();
                            return null;
                        }
                    } else {
                        this.Y = 1;
                        break;
                    }
                    return jg7.a;
                }
                this.Y = 3;
                break;
            case 2:
                q35 q35Var = (q35) this.d0;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            q35Var = (q35) this.Z;
                            oi2.Y(obj);
                            e = obj;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        RomDetailsActivity romDetailsActivity = (RomDetailsActivity) this.e0;
                        qa4 qa4Var = (qa4) this.f0;
                        e70 e70Var = romDetailsActivity.A0;
                        if (e70Var != null) {
                            this.d0 = null;
                            this.Z = q35Var;
                            this.Y = 1;
                            e = e70Var.e((pq5) qa4Var.getValue(), this);
                            if (e == x61Var3) {
                                return x61Var3;
                            }
                        } else {
                            nb3.a0("boxArtRepository");
                            throw null;
                        }
                    }
                    em5Var = (String) e;
                } catch (Throwable th2) {
                    em5Var = new em5(th2);
                }
                if (!(em5Var instanceof em5)) {
                    obj3 = em5Var;
                }
                q35Var.setValue(obj3);
                return jg7.a;
            case 3:
                q35 q35Var2 = (q35) this.d0;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                try {
                    if (i5 != 0) {
                        if (i5 == 1) {
                            q35Var2 = (q35) this.Z;
                            oi2.Y(obj);
                            e2 = obj;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        RomDetailsActivity romDetailsActivity2 = (RomDetailsActivity) this.e0;
                        pq5 pq5Var = (pq5) this.f0;
                        e70 e70Var2 = romDetailsActivity2.A0;
                        if (e70Var2 != null) {
                            this.d0 = null;
                            this.Z = q35Var2;
                            this.Y = 1;
                            e2 = e70Var2.e(pq5Var, this);
                            if (e2 == x61Var4) {
                                return x61Var4;
                            }
                        } else {
                            nb3.a0("boxArtRepository");
                            throw null;
                        }
                    }
                    em5Var2 = (String) e2;
                } catch (Throwable th3) {
                    em5Var2 = new em5(th3);
                }
                if (!(em5Var2 instanceof em5)) {
                    obj3 = em5Var2;
                }
                q35Var2.setValue(obj3);
                return jg7.a;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                        rj0Var = (r41) this.Z;
                        d0 = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    j61 Z = ((w61) this.Z).A().Z(d90.r0);
                    Z.getClass();
                    n61 n61Var = (n61) Z;
                    l61 y = jw2.y(n61Var, new b97(n61Var));
                    l61 N = y.N(new l57(y, ((m16) this.d0).i));
                    rj0Var = (rj0) this.e0;
                    this.Z = rj0Var;
                    this.Y = 1;
                    d0 = hv.d0(N, (w81) this.f0, this);
                    if (d0 == x61Var5) {
                        return x61Var5;
                    }
                }
                rj0Var.i(d0);
                return jg7.a;
            case 5:
                AtomicReference atomicReference = (AtomicReference) this.e0;
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                try {
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                vc6Var2 = (vc6) this.Z;
                                try {
                                    oi2.Y(obj);
                                    o = obj;
                                    while (!atomicReference.compareAndSet(vc6Var2, null) && atomicReference.get() == vc6Var2) {
                                    }
                                    return o;
                                } catch (Throwable th4) {
                                    th = th4;
                                    while (!atomicReference.compareAndSet(vc6Var2, null) && atomicReference.get() == vc6Var2) {
                                    }
                                    throw th;
                                }
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vc6Var = (vc6) this.Z;
                        oi2.Y(obj);
                    } else {
                        oi2.Y(obj);
                        w61 w61Var3 = (w61) this.Z;
                        vc6 vc6Var3 = new vc6(yh2.u(w61Var3.A()), ((qn2) this.d0).g(w61Var3));
                        vc6 vc6Var4 = (vc6) atomicReference.getAndSet(vc6Var3);
                        if (vc6Var4 != null) {
                            rc3 rc3Var = vc6Var4.a;
                            this.Z = vc6Var3;
                            this.Y = 1;
                            break;
                        }
                        vc6Var = vc6Var3;
                    }
                    Object obj4 = vc6Var.b;
                    this.Z = vc6Var;
                    this.Y = 2;
                    o = ((eo2) this.f0).o(obj4, this);
                    if (o != x61Var6) {
                        vc6Var2 = vc6Var;
                        while (!atomicReference.compareAndSet(vc6Var2, null)) {
                            while (!atomicReference.compareAndSet(vc6Var2, null)) {
                            }
                        }
                        return o;
                    }
                    return x61Var6;
                } catch (Throwable th5) {
                    th = th5;
                    vc6Var2 = vc6Var;
                    while (!atomicReference.compareAndSet(vc6Var2, null)) {
                        while (!atomicReference.compareAndSet(vc6Var2, null)) {
                        }
                    }
                    throw th;
                }
            case 6:
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    g21 f0 = np2.f0(new wc((dd) this.Z, 6));
                    zw6 zw6Var = new zw6((qa4) this.d0, (qa4) this.e0, (qa4) this.f0, null);
                    this.Y = 1;
                    if (f04.v(f0, zw6Var, this) == x61Var7) {
                        return x61Var7;
                    }
                }
                return jg7.a;
            case 7:
                z87 z87Var2 = (z87) this.f0;
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i9 = this.Y;
                try {
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 == 2) {
                                w61Var = (w61) this.e0;
                                oi2.Y(obj);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            m86Var = (m86) this.d0;
                            z87 z87Var3 = (z87) this.Z;
                            w61 w61Var4 = (w61) this.e0;
                            oi2.Y(obj);
                            z87Var = z87Var3;
                            w61Var2 = w61Var4;
                            obj2 = obj;
                            this.e0 = w61Var2;
                            this.Z = null;
                            this.d0 = null;
                            this.Y = 2;
                            if (z87.c(z87Var, m86Var, (x87) obj2, this) != x61Var8) {
                                w61Var = w61Var2;
                            }
                            return x61Var8;
                        }
                    } else {
                        oi2.Y(obj);
                        w61Var = (w61) this.e0;
                    }
                    if (yh2.z(w61Var.A())) {
                        m86 m86Var2 = z87Var2.a;
                        v80 v80Var = z87Var2.f;
                        this.e0 = w61Var;
                        this.Z = z87Var2;
                        this.d0 = m86Var2;
                        this.Y = 1;
                        v80Var.getClass();
                        obj2 = v80.L(v80Var, this);
                        if (obj2 != x61Var8) {
                            w61Var2 = w61Var;
                            m86Var = m86Var2;
                            z87Var = z87Var2;
                            this.e0 = w61Var2;
                            this.Z = null;
                            this.d0 = null;
                            this.Y = 2;
                            if (z87.c(z87Var, m86Var, (x87) obj2, this) != x61Var8) {
                            }
                            return x61Var8;
                        }
                        return x61Var8;
                    }
                    z87Var2.g = null;
                    return jg7.a;
                } catch (Throwable th6) {
                    z87Var2.g = null;
                    throw th6;
                }
            case 8:
                int[] iArr = (int[]) this.e0;
                nc7 nc7Var = (nc7) this.d0;
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            try {
                                oi2.Y(obj);
                                j = 1;
                                throw new RuntimeException();
                            } catch (Throwable th7) {
                                th = th7;
                                j = 1;
                                di4Var = nc7Var.h;
                                di4Var.getClass();
                                iArr.getClass();
                                reentrantLock = di4Var.a;
                                reentrantLock.lock();
                                try {
                                    z2 = false;
                                    while (r5 < r4) {
                                    }
                                    if (!z2) {
                                        boolean z3 = di4Var.f;
                                    }
                                    reentrantLock.unlock();
                                    throw th;
                                } catch (Throwable th8) {
                                    reentrantLock.unlock();
                                    throw th8;
                                }
                            }
                        }
                        ne2Var2 = (ne2) this.Z;
                        oi2.Y(obj);
                        j = 1;
                        ne2Var = ne2Var2;
                        try {
                            ?? obj5 = new Object();
                            s63 s63Var = nc7Var.i;
                            bm0 bm0Var = new bm0(obj5, ne2Var, (String[]) this.f0, iArr);
                            this.Z = null;
                            this.Y = 3;
                            break;
                        } catch (Throwable th9) {
                            th = th9;
                            di4Var = nc7Var.h;
                            di4Var.getClass();
                            iArr.getClass();
                            reentrantLock = di4Var.a;
                            reentrantLock.lock();
                            z2 = false;
                            for (int i11 : iArr) {
                                long[] jArr = di4Var.b;
                                long j2 = jArr[i11];
                                jArr[i11] = j2 - j;
                                if (j2 == j) {
                                    di4Var.d = true;
                                    z2 = true;
                                }
                            }
                            if (!z2 && !di4Var.d) {
                                boolean z32 = di4Var.f;
                            }
                            reentrantLock.unlock();
                            throw th;
                        }
                    } else {
                        ne2Var = (ne2) this.Z;
                        oi2.Y(obj);
                        l61Var = obj;
                        j = 1;
                    }
                } else {
                    oi2.Y(obj);
                    ne2Var = (ne2) this.Z;
                    di4 di4Var2 = nc7Var.h;
                    di4Var2.getClass();
                    iArr.getClass();
                    ReentrantLock reentrantLock2 = di4Var2.a;
                    reentrantLock2.lock();
                    try {
                        boolean z4 = false;
                        for (int i12 : iArr) {
                            long[] jArr2 = di4Var2.b;
                            long j3 = jArr2[i12];
                            jArr2[i12] = j3 + 1;
                            if (j3 == 0) {
                                di4Var2.d = true;
                                z4 = true;
                            }
                        }
                        j = 1;
                        if (!z4 && !di4Var2.d) {
                            if (!di4Var2.f) {
                                z = false;
                                reentrantLock2.unlock();
                                if (z) {
                                    m16 m16Var = nc7Var.a;
                                    this.Z = ne2Var;
                                    this.Y = 1;
                                    l61 F = hv.F(m16Var, false, this);
                                    l61Var = F;
                                    break;
                                }
                                ?? obj52 = new Object();
                                s63 s63Var2 = nc7Var.i;
                                bm0 bm0Var2 = new bm0(obj52, ne2Var, (String[]) this.f0, iArr);
                                this.Z = null;
                                this.Y = 3;
                            }
                        }
                        z = true;
                        reentrantLock2.unlock();
                        if (z) {
                        }
                        ?? obj522 = new Object();
                        s63 s63Var22 = nc7Var.i;
                        bm0 bm0Var22 = new bm0(obj522, ne2Var, (String[]) this.f0, iArr);
                        this.Z = null;
                        this.Y = 3;
                    } catch (Throwable th10) {
                        reentrantLock2.unlock();
                        throw th10;
                    }
                }
                ns3 ns3Var = new ns3(nc7Var, null, 16);
                this.Z = ne2Var;
                this.Y = 2;
                if (hv.d0((l61) l61Var, ns3Var, this) != x61Var9) {
                    ne2Var2 = ne2Var;
                    ne2Var = ne2Var2;
                    ?? obj5222 = new Object();
                    s63 s63Var222 = nc7Var.i;
                    bm0 bm0Var222 = new bm0(obj5222, ne2Var, (String[]) this.f0, iArr);
                    this.Z = null;
                    this.Y = 3;
                }
                return x61Var9;
            case 9:
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            oi2.Y(obj);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    k = obj;
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    k = ri7.k((ri7) this.Z, (ki7) this.d0, (Map) this.e0, (xy0) this.f0, this);
                    break;
                }
                this.Y = 2;
                break;
            case 10:
                x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        qr7Var = (qr7) this.Z;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    String str2 = ((pr7) ((qa4) this.d0).getValue()).k;
                    if (str2 != null) {
                        qr7 qr7Var2 = (qr7) this.f0;
                        this.Z = qr7Var2;
                        this.Y = 1;
                        if (gl6.b((gl6) this.e0, str2, null, this, 6) == x61Var11) {
                            return x61Var11;
                        }
                        qr7Var = qr7Var2;
                    } else {
                        return jg7.a;
                    }
                }
                tp6 tp6Var2 = qr7Var.e;
                do {
                    value = tp6Var2.getValue();
                } while (!tp6Var2.j(value, pr7.a((pr7) value, false, null, null, null, null, null, null, null, null, null, null, 1023)));
                return jg7.a;
            case 11:
                tv7 tv7Var = (tv7) this.f0;
                hu3 hu3Var = (hu3) this.e0;
                jg7 jg7Var = jg7.a;
                if5 if5Var = (if5) this.d0;
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                int i15 = this.Y;
                try {
                    if (i15 != 0) {
                        if (i15 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        o74 o74Var = (o74) ((dh5) this.Z).A;
                        if (o74Var != null) {
                            o74Var.B = g04.i(if5Var.x);
                        }
                        this.Y = 1;
                        hf5 hf5Var = new hf5(if5Var, null);
                        l61 l61Var2 = this.B;
                        l61Var2.getClass();
                        ?? d02 = hv.d0(if5Var.a, new ji(if5Var, hf5Var, ii2.x(l61Var2), null, 12), this);
                        x61 x61Var13 = d02;
                        if (d02 != x61Var12) {
                            x61Var13 = jg7Var;
                        }
                        if (x61Var13 != x61Var12) {
                            x61Var13 = jg7Var;
                        }
                        if (x61Var13 == x61Var12) {
                            return x61Var12;
                        }
                    }
                    return jg7Var;
                } finally {
                    hu3Var.getLifecycle().c(tv7Var);
                }
            default:
                String str3 = ((yw7) this.d0).c;
                nx3 nx3Var = (nx3) this.Z;
                x61 x61Var14 = x61.COROUTINE_SUSPENDED;
                int i16 = this.Y;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            oi2.Y(obj);
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    a = obj;
                } else {
                    oi2.Y(obj);
                    tb0 a2 = nx3Var.a();
                    this.Y = 1;
                    a = sx7.a(a2, nx3Var, this);
                    break;
                }
                wj2 wj2Var = (wj2) a;
                if (wj2Var != null) {
                    ga0.f().b(ew7.a, "Updating notification for " + str3);
                    fw7 fw7Var = (fw7) this.e0;
                    gx3 p = yh2.p(fw7Var.a.a, "setForegroundAsync", new hf0(fw7Var, nx3Var.b.a, wj2Var, (Context) this.f0));
                    this.Y = 2;
                    Object m = gi2.m(p, this);
                    if (m != x61Var14) {
                        return m;
                    }
                    return x61Var14;
                }
                i.m(lb1.A("Worker was marked important (", str3, ") but did not provide ForegroundInfo"));
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp5(Object obj, Object obj2, Object obj3, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = obj;
        this.e0 = obj2;
        this.f0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp5(z87 z87Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 7;
        this.f0 = z87Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp5(RomDetailsActivity romDetailsActivity, Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.e0 = romDetailsActivity;
        this.f0 = obj;
    }
}
