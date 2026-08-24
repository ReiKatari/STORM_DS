package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ql5  reason: default package */
/* loaded from: classes.dex */
public final class ql5 {
    public final android.content.res.ColorStateList a;
    public final android.content.res.Configuration b;
    public final int c;

    public ql5(android.content.res.ColorStateList r1, android.content.res.Configuration r2, android.content.res.Resources.Theme r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            if (r3 != 0) goto Lb
            r1 = 0
            goto Lf
        Lb:
            int r1 = r3.hashCode()
        Lf:
            r0.c = r1
            return
    }
}
