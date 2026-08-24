package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w87  reason: default package */
/* loaded from: classes.dex */
public final class w87 {
    public final android.content.Context a;
    public final defpackage.a21 b;
    public final defpackage.w30 c;
    public final defpackage.if4 d;
    public final defpackage.a21 e;

    public w87(android.content.Context r7, defpackage.ow7 r8) {
            r6 = this;
            w30 r0 = new w30
            android.content.Context r1 = r7.getApplicationContext()
            r1.getClass()
            r2 = 0
            r0.<init>(r1, r8, r2)
            w30 r1 = new w30
            android.content.Context r2 = r7.getApplicationContext()
            r2.getClass()
            r3 = 1
            r1.<init>(r2, r8, r3)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 >= r3) goto L2f
            android.content.Context r2 = r7.getApplicationContext()
            r2.getClass()
            java.lang.String r3 = defpackage.hf4.a
            if4 r3 = new if4
            r3.<init>(r2, r8)
            goto L30
        L2f:
            r3 = 0
        L30:
            w30 r2 = new w30
            android.content.Context r4 = r7.getApplicationContext()
            r4.getClass()
            r5 = 2
            r2.<init>(r4, r8, r5)
            r6.<init>()
            r6.a = r7
            r6.b = r0
            r6.c = r1
            r6.d = r3
            r6.e = r2
            return
    }
}
