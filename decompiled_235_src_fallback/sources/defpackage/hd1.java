package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hd1  reason: default package */
/* loaded from: classes.dex */
public final class hd1 extends defpackage.hb0 {
    public final java.util.concurrent.Executor a;

    public hd1(java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.hb0
    public final defpackage.ib0 a(java.lang.reflect.Type r4, java.lang.annotation.Annotation[] r5) {
            r3 = this;
            java.lang.Class r0 = defpackage.ak7.c0(r4)
            java.lang.Class<gb0> r1 = defpackage.gb0.class
            r2 = 0
            if (r0 == r1) goto La
            return r2
        La:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L26
            r0 = 0
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = defpackage.ak7.Y(r0, r4)
            java.lang.Class<nj6> r0 = defpackage.nj6.class
            boolean r5 = defpackage.ak7.l0(r5, r0)
            if (r5 == 0) goto L1e
            goto L20
        L1e:
            java.util.concurrent.Executor r2 = r3.a
        L20:
            yc1 r3 = new yc1
            r3.<init>(r4, r2)
            return r3
        L26:
            java.lang.String r3 = "Call return type must be parameterized as Call<Foo> or Call<? extends Foo>"
            defpackage.i.h(r3)
            return r2
    }
}
