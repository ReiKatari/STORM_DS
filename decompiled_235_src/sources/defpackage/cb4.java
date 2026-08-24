package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cb4  reason: default package */
/* loaded from: classes.dex */
public final class cb4 extends hw6 implements eo2 {
    public fb4 X;
    public Object Y;
    public Object Z;
    public db4 d0;
    public int e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ xa4 g0;
    public final /* synthetic */ db4 h0;
    public final /* synthetic */ eo2 i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb4(xa4 xa4Var, db4 db4Var, eo2 eo2Var, Object obj, r41 r41Var) {
        super(2, r41Var);
        this.g0 = xa4Var;
        this.h0 = db4Var;
        this.i0 = eo2Var;
        this.j0 = obj;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((cb4) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        cb4 cb4Var = new cb4(this.g0, this.h0, this.i0, this.j0, r41Var);
        cb4Var.f0 = obj;
        return cb4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #0 {all -> 0x00a2, blocks: (B:22:0x008f, B:23:0x0091, B:26:0x0098, B:34:0x00a9, B:35:0x00ab, B:37:0x00b1, B:40:0x00b8), top: B:43:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, fb4] */
    /* JADX WARN: Type inference failed for: r6v2, types: [fb4] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        ab4 ab4Var;
        db4 db4Var;
        hb4 hb4Var;
        eo2 eo2Var;
        Object obj2;
        db4 db4Var2;
        Throwable th;
        ab4 ab4Var2;
        fb4 fb4Var;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        ?? r1 = this.e0;
        try {
            try {
                if (r1 != 0) {
                    if (r1 != 1) {
                        if (r1 == 2) {
                            db4Var2 = (db4) this.Y;
                            fb4Var = this.X;
                            ab4Var2 = (ab4) this.f0;
                            try {
                                oi2.Y(obj);
                                atomicReference2 = db4Var2.a;
                                while (!atomicReference2.compareAndSet(ab4Var2, null) && atomicReference2.get() == ab4Var2) {
                                }
                                fb4Var.h(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = db4Var2.a;
                                while (!atomicReference.compareAndSet(ab4Var2, null)) {
                                }
                                throw th;
                            }
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    db4 db4Var3 = this.d0;
                    obj2 = this.Z;
                    ?? r6 = this.X;
                    oi2.Y(obj);
                    eo2Var = (eo2) this.Y;
                    hb4Var = r6;
                    db4Var = db4Var3;
                    ab4Var = (ab4) this.f0;
                } else {
                    oi2.Y(obj);
                    j61 Z = ((w61) this.f0).A().Z(vs0.h0);
                    Z.getClass();
                    ab4Var = new ab4(this.g0, (rc3) Z);
                    db4Var = this.h0;
                    db4.a(db4Var, ab4Var);
                    hb4Var = db4Var.b;
                    this.f0 = ab4Var;
                    this.X = hb4Var;
                    eo2Var = this.i0;
                    this.Y = eo2Var;
                    Object obj3 = this.j0;
                    this.Z = obj3;
                    this.d0 = db4Var;
                    this.e0 = 1;
                    if (hb4Var.e(this) != x61Var) {
                        obj2 = obj3;
                    }
                    return x61Var;
                }
                this.f0 = ab4Var;
                this.X = hb4Var;
                this.Y = db4Var;
                this.Z = null;
                this.d0 = null;
                this.e0 = 2;
                Object o = eo2Var.o(obj2, this);
                if (o != x61Var) {
                    db4Var2 = db4Var;
                    obj = o;
                    ab4Var2 = ab4Var;
                    fb4Var = hb4Var;
                    atomicReference2 = db4Var2.a;
                    while (!atomicReference2.compareAndSet(ab4Var2, null)) {
                        while (!atomicReference2.compareAndSet(ab4Var2, null)) {
                        }
                    }
                    fb4Var.h(null);
                    return obj;
                }
                return x61Var;
            } catch (Throwable th3) {
                db4Var2 = db4Var;
                th = th3;
                ab4Var2 = ab4Var;
                atomicReference = db4Var2.a;
                while (!atomicReference.compareAndSet(ab4Var2, null) && atomicReference.get() == ab4Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.h(null);
            throw th4;
        }
    }
}
