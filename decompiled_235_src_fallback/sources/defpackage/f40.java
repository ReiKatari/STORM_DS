package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f40  reason: default package */
/* loaded from: classes.dex */
public final class f40 {
    public static final byte[] e = null;
    public final java.lang.CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
            r0 = 1792(0x700, float:2.511E-42)
            byte[] r1 = new byte[r0]
            defpackage.f40.e = r1
            r1 = 0
        L7:
            if (r1 >= r0) goto L14
            byte[] r2 = defpackage.f40.e
            byte r3 = java.lang.Character.getDirectionality(r1)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L7
        L14:
            return
    }

    public f40(java.lang.CharSequence r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            int r1 = r1.length()
            r0.b = r1
            return
    }

    public final byte a() {
            r3 = this;
            int r0 = r3.c
            int r0 = r0 + (-1)
            java.lang.CharSequence r1 = r3.a
            char r0 = r1.charAt(r0)
            r3.d = r0
            boolean r0 = java.lang.Character.isLowSurrogate(r0)
            int r2 = r3.c
            if (r0 == 0) goto L26
            int r0 = java.lang.Character.codePointBefore(r1, r2)
            int r1 = r3.c
            int r2 = java.lang.Character.charCount(r0)
            int r1 = r1 - r2
            r3.c = r1
            byte r3 = java.lang.Character.getDirectionality(r0)
            return r3
        L26:
            int r2 = r2 + (-1)
            r3.c = r2
            char r3 = r3.d
            r0 = 1792(0x700, float:2.511E-42)
            if (r3 >= r0) goto L35
            byte[] r0 = defpackage.f40.e
            r3 = r0[r3]
            goto L39
        L35:
            byte r3 = java.lang.Character.getDirectionality(r3)
        L39:
            return r3
    }
}
