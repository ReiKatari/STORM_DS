package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nh7  reason: default package */
/* loaded from: classes.dex */
public final class nh7 {
    public static final wo f = new wo(RecyclerView.B1);
    public final il7 a;
    public long b = Long.MIN_VALUE;
    public wo c = f;
    public boolean d;
    public float e;

    public nh7(to toVar) {
        this.a = toVar.a(nw7.e0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r13 != androidx.recyclerview.widget.RecyclerView.B1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
        if (defpackage.ii2.x(r0).a(r9, r4) == r3) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Type inference failed for: r13v3, types: [on2] */
    /* JADX WARN: Type inference failed for: r14v7, types: [qn2] */
    /* JADX WARN: Type inference failed for: r2v10, types: [on2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a6 -> B:36:0x00a9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t00 t00Var, u6 u6Var, s41 s41Var) {
        mh7 mh7Var;
        int i;
        wo woVar;
        float f2;
        float f3;
        mh7 mh7Var2;
        t00 t00Var2;
        u6 u6Var2;
        u6 u6Var3;
        u6 u6Var4;
        u6 u6Var5;
        try {
            if (s41Var instanceof mh7) {
                mh7Var = (mh7) s41Var;
                int i2 = mh7Var.e0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mh7Var.e0 = i2 - Integer.MIN_VALUE;
                    Object obj = mh7Var.Z;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = mh7Var.e0;
                    woVar = f;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                ?? r2 = (on2) mh7Var.R;
                                oi2.Y(obj);
                                u6Var5 = r2;
                                u6Var5.c();
                                this.b = Long.MIN_VALUE;
                                this.c = woVar;
                                this.d = false;
                                return jg7.a;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        float f4 = mh7Var.Y;
                        ?? r13 = mh7Var.X;
                        ?? r14 = (qn2) mh7Var.R;
                        oi2.Y(obj);
                        mh7Var2 = mh7Var;
                        u6Var4 = r13;
                        f3 = f4;
                        t00Var2 = r14;
                        u6Var4.c();
                        u6Var2 = u6Var4;
                        u6Var3 = u6Var4;
                    } else {
                        oi2.Y(obj);
                        if (this.d) {
                            s53.c("animateToZero called while previous animation is running");
                        }
                        l61 l61Var = mh7Var.B;
                        l61Var.getClass();
                        n74 n74Var = (n74) l61Var.Z(cs1.f0);
                        if (n74Var != null) {
                            f2 = n74Var.F();
                        } else {
                            f2 = 1.0f;
                        }
                        this.d = true;
                        f3 = f2;
                        mh7Var2 = mh7Var;
                        t00Var2 = t00Var;
                        u6Var2 = u6Var;
                        if (Math.abs(this.e) >= 0.01f) {
                            uf ufVar = new uf(this, f3, t00Var2);
                            mh7Var2.R = t00Var2;
                            mh7Var2.X = u6Var2;
                            mh7Var2.Y = f3;
                            mh7Var2.e0 = 1;
                            l61 l61Var2 = mh7Var2.B;
                            l61Var2.getClass();
                            u6Var4 = u6Var2;
                            if (ii2.x(l61Var2).a(ufVar, mh7Var2) == x61Var) {
                                return x61Var;
                            }
                            u6Var4.c();
                            u6Var2 = u6Var4;
                            u6Var3 = u6Var4;
                        } else {
                            u6Var3 = u6Var2;
                            if (Math.abs(this.e) != RecyclerView.B1) {
                                ja7 ja7Var = new ja7(5, this, t00Var2);
                                mh7Var2.R = u6Var3;
                                mh7Var2.X = null;
                                mh7Var2.e0 = 2;
                                l61 l61Var3 = mh7Var2.B;
                                l61Var3.getClass();
                                u6Var5 = u6Var3;
                            } else {
                                this.b = Long.MIN_VALUE;
                                this.c = woVar;
                                this.d = false;
                                return jg7.a;
                            }
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th) {
            this.b = Long.MIN_VALUE;
            this.c = woVar;
            this.d = false;
            throw th;
        }
        mh7Var = new mh7(this, s41Var);
        Object obj2 = mh7Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = mh7Var.e0;
        woVar = f;
    }
}
