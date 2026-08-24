package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s76  reason: default package */
/* loaded from: classes.dex */
public final class s76 implements defpackage.f86 {
    public static final defpackage.ap3 j = null;
    public final defpackage.ss4 a;
    public final defpackage.ss4 b;
    public final defpackage.ss4 c;
    public final defpackage.r94 d;
    public final defpackage.ss4 e;
    public float f;
    public final defpackage.bf1 g;
    public final defpackage.ii1 h;
    public final defpackage.ii1 i;

    static {
            l56 r0 = new l56
            r1 = 22
            r2 = 0
            r0.<init>(r1, r2)
            r76 r1 = new r76
            r1.<init>(r2)
            ap3 r2 = new ap3
            r3 = 28
            r2.<init>(r3, r0, r1)
            defpackage.s76.j = r2
            return
    }

    public s76(int r3) {
            r2 = this;
            r2.<init>()
            ss4 r0 = new ss4
            r0.<init>(r3)
            r2.a = r0
            ss4 r3 = new ss4
            r0 = 0
            r3.<init>(r0)
            r2.b = r3
            ss4 r3 = new ss4
            r3.<init>(r0)
            r2.c = r3
            r94 r3 = new r94
            r3.<init>()
            r2.d = r3
            ss4 r3 = new ss4
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3.<init>(r1)
            r2.e = r3
            ro5 r3 = new ro5
            r1 = 7
            r3.<init>(r2, r1)
            bf1 r1 = new bf1
            r1.<init>(r3)
            r2.g = r1
            q76 r3 = new q76
            r3.<init>(r2, r0)
            ii1 r3 = defpackage.np2.I(r3)
            r2.h = r3
            q76 r3 = new q76
            r0 = 1
            r3.<init>(r2, r0)
            ii1 r3 = defpackage.np2.I(r3)
            r2.i = r3
            return
    }

    @Override // defpackage.f86
    public final boolean a() {
            r0 = this;
            bf1 r0 = r0.g
            boolean r0 = r0.a()
            return r0
    }

    @Override // defpackage.f86
    public final boolean b() {
            r0 = this;
            ii1 r0 = r0.i
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // defpackage.f86
    public final boolean c() {
            r0 = this;
            ii1 r0 = r0.h
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // defpackage.f86
    public final java.lang.Object d(defpackage.xa4 r1, defpackage.eo2 r2, defpackage.s41 r3) {
            r0 = this;
            bf1 r0 = r0.g
            java.lang.Object r0 = r0.d(r1, r2, r3)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto Lb
            return r0
        Lb:
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    @Override // defpackage.f86
    public final float e(float r1) {
            r0 = this;
            bf1 r0 = r0.g
            float r0 = r0.e(r1)
            return r0
    }
}
