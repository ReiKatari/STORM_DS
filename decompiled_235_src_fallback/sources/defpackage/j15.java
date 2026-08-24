package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j15  reason: default package */
/* loaded from: classes.dex */
public final class j15 extends defpackage.yf5 {
    public final defpackage.t15 a;
    public final androidx.recyclerview.widget.RecyclerView b;
    public final androidx.preference.Preference c;
    public final java.lang.String d;

    public j15(defpackage.t15 r1, androidx.recyclerview.widget.RecyclerView r2, androidx.preference.Preference r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // defpackage.yf5
    public final void a() {
            r0 = this;
            r0.c()
            return
    }

    @Override // defpackage.yf5
    public final void b(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.c()
            return
    }

    public final void c() {
            r2 = this;
            t15 r0 = r2.a
            xf5 r1 = r0.a
            r1.unregisterObserver(r2)
            androidx.preference.Preference r1 = r2.c
            if (r1 == 0) goto L10
            int r0 = r0.k(r1)
            goto L16
        L10:
            java.lang.String r1 = r2.d
            int r0 = r0.l(r1)
        L16:
            r1 = -1
            if (r0 == r1) goto L1e
            androidx.recyclerview.widget.RecyclerView r2 = r2.b
            r2.h0(r0)
        L1e:
            return
    }
}
