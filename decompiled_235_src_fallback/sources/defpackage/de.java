package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: de  reason: default package */
/* loaded from: classes.dex */
public final class de implements defpackage.ur0 {
    public final android.content.Context a;
    public android.content.ClipboardManager b;

    public de(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final android.content.ClipboardManager a() {
            r2 = this;
            android.content.ClipboardManager r0 = r2.b
            if (r0 != 0) goto L13
            android.content.Context r0 = r2.a
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)
            r0.getClass()
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            r2.b = r0
        L13:
            return r0
    }
}
