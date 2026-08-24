package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf5  reason: default package */
/* loaded from: classes.dex */
public final class xf5 extends android.database.Observable {
    public final boolean a() {
            r0 = this;
            java.util.ArrayList r0 = r0.mObservers
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public final void b() {
            r2 = this;
            java.util.ArrayList r0 = r2.mObservers
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList r1 = r2.mObservers
            java.lang.Object r1 = r1.get(r0)
            yf5 r1 = (defpackage.yf5) r1
            r1.a()
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    public final void c(int r3, int r4, androidx.preference.Preference r5) {
            r2 = this;
            java.util.ArrayList r0 = r2.mObservers
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList r1 = r2.mObservers
            java.lang.Object r1 = r1.get(r0)
            yf5 r1 = (defpackage.yf5) r1
            r1.b(r5, r3, r4)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }
}
