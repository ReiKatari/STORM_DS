package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wh4  reason: default package */
/* loaded from: classes.dex */
public final class wh4 implements gg3 {
    public final Object a;
    public final List b;
    public final go3 c;

    public wh4(String str, Object obj) {
        obj.getClass();
        this.a = obj;
        this.b = yt1.A;
        this.c = kj2.M(xr3.PUBLICATION, new ci2(15, str, this));
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        wb6 e = e();
        ux0 c = sc1Var.c(e);
        c.getClass();
        int q = c.q(e());
        if (q == -1) {
            c.a(e);
            return this.a;
        }
        throw new IllegalArgumentException(lb1.g(q, "Unexpected index "));
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        obj.getClass();
        x32Var.c(e()).a(e());
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return (wb6) this.c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wh4(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        obj.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.b = asList;
    }
}
