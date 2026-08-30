package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d94  reason: default package */
/* loaded from: classes.dex */
public final class d94 implements m93 {
    public final Object a;
    public final List b;
    public final gh3 c;

    public d94(Object obj, String str) {
        obj.getClass();
        this.a = obj;
        this.b = pp1.A;
        this.c = yf2.H(wk3.PUBLICATION, new jd2(14, str, this));
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        h06 e = e();
        yu0 c = b91Var.c(e);
        c.getClass();
        int v = c.v(e());
        if (v == -1) {
            c.a(e);
            return this.a;
        }
        throw new IllegalArgumentException(wh1.g(v, "Unexpected index "));
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        obj.getClass();
        mz1Var.c(e()).a(e());
    }

    @Override // defpackage.m93
    public final h06 e() {
        return (h06) this.c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d94(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        obj.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.b = asList;
    }
}
