package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l76  reason: default package */
/* loaded from: classes.dex */
public final class l76 {
    public final defpackage.k76 a;

    public l76(androidx.core.widget.NestedScrollView r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L11
            j76 r0 = new j76
            r0.<init>(r3)
            r2.a = r0
            return
        L11:
            q61 r3 = new q61
            r3.<init>()
            r2.a = r3
            return
    }
}
