package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xu0  reason: default package */
/* loaded from: classes.dex */
public final class xu0 extends defpackage.hb0 {
    @Override // defpackage.hb0
    public final defpackage.ib0 a(java.lang.reflect.Type r3, java.lang.annotation.Annotation[] r4) {
            r2 = this;
            java.lang.Class r2 = defpackage.ak7.c0(r3)
            java.lang.Class<java.util.concurrent.CompletableFuture> r4 = java.util.concurrent.CompletableFuture.class
            r0 = 0
            if (r2 == r4) goto La
            return r0
        La:
            boolean r2 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L3a
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r2 = 0
            java.lang.reflect.Type r3 = defpackage.ak7.Y(r2, r3)
            java.lang.Class r4 = defpackage.ak7.c0(r3)
            java.lang.Class<vl5> r1 = defpackage.vl5.class
            if (r4 == r1) goto L23
            vu0 r4 = new vu0
            r4.<init>(r2, r3)
            return r4
        L23:
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L34
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r2 = defpackage.ak7.Y(r2, r3)
            vu0 r3 = new vu0
            r4 = 1
            r3.<init>(r4, r2)
            return r3
        L34:
            java.lang.String r2 = "Response must be parameterized as Response<Foo> or Response<? extends Foo>"
            defpackage.i.m(r2)
            return r0
        L3a:
            java.lang.String r2 = "CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>"
            defpackage.i.m(r2)
            return r0
    }
}
