package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej7  reason: default package */
/* loaded from: classes.dex */
public final class ej7 {
    public final defpackage.ei7 a;
    public final defpackage.sh0 b;
    public final defpackage.qt2 c;
    public final defpackage.ei7 d;
    public final defpackage.ex6 e;
    public final defpackage.ex6 f;

    public ej7(defpackage.ei7 r1, defpackage.sh0 r2, defpackage.qt2 r3, defpackage.ei7 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            dj7 r1 = new dj7
            r2 = 0
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.e = r2
            dj7 r1 = new dj7
            r2 = 1
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.f = r2
            return
    }

    public final defpackage.sf0 a() {
            r0 = this;
            ex6 r0 = r0.e
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            sf0 r0 = (defpackage.sf0) r0
            return r0
    }

    public final java.util.LinkedHashSet b(java.util.List r4) {
            r3 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r4.next()
            ig1 r1 = (defpackage.ig1) r1
            ex6 r2 = r3.f
            java.lang.Object r2 = r2.getValue()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r2.get(r1)
            kr6 r1 = (defpackage.kr6) r1
            if (r1 == 0) goto L9
            int r1 = r1.a
            kr6 r2 = new kr6
            r2.<init>(r1)
            r0.add(r2)
            goto L9
        L30:
            return r0
    }
}
