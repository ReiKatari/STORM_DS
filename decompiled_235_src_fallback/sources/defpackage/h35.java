package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h35  reason: default package */
/* loaded from: classes.dex */
public final class h35 implements defpackage.hu3 {
    public static final defpackage.h35 e0 = null;
    public int A;
    public int B;
    public boolean L;
    public boolean R;
    public android.os.Handler X;
    public final defpackage.ku3 Y;
    public final defpackage.rk3 Z;
    public final defpackage.s63 d0;

    static {
            h35 r0 = new h35
            r0.<init>()
            defpackage.h35.e0 = r0
            return
    }

    public h35() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.L = r0
            r2.R = r0
            ku3 r1 = new ku3
            r1.<init>(r2, r0)
            r2.Y = r1
            rk3 r0 = new rk3
            r1 = 7
            r0.<init>(r2, r1)
            r2.Z = r0
            s63 r0 = new s63
            r1 = 29
            r0.<init>(r2, r1)
            r2.d0 = r0
            return
    }

    public final void a() {
            r2 = this;
            int r0 = r2.B
            r1 = 1
            int r0 = r0 + r1
            r2.B = r0
            if (r0 != r1) goto L21
            boolean r0 = r2.L
            if (r0 == 0) goto L17
            ku3 r0 = r2.Y
            st3 r1 = defpackage.st3.ON_RESUME
            r0.f(r1)
            r0 = 0
            r2.L = r0
            return
        L17:
            android.os.Handler r0 = r2.X
            r0.getClass()
            rk3 r2 = r2.Z
            r0.removeCallbacks(r2)
        L21:
            return
    }

    @Override // defpackage.hu3
    public final defpackage.ut3 getLifecycle() {
            r0 = this;
            ku3 r0 = r0.Y
            return r0
    }
}
