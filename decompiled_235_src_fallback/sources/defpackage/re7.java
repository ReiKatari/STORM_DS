package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: re7  reason: default package */
/* loaded from: classes.dex */
public final class re7 {
    public static final java.lang.ThreadLocal d = null;
    public final int a;
    public final defpackage.eb b;
    public volatile int c;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.re7.d = r0
            return
    }

    public re7(defpackage.eb r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.b = r2
            r1.a = r3
            return
    }

    public final int a(int r3) {
            r2 = this;
            p54 r2 = r2.b()
            r0 = 16
            int r0 = r2.a(r0)
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.R
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r2.A
            int r0 = r0 + r2
            int r2 = r1.getInt(r0)
            int r2 = r2 + r0
            int r2 = r2 + 4
            int r3 = r3 * 4
            int r3 = r3 + r2
            int r2 = r1.getInt(r3)
            return r2
        L22:
            r2 = 0
            return r2
    }

    public final defpackage.p54 b() {
            r4 = this;
            java.lang.ThreadLocal r0 = defpackage.re7.d
            java.lang.Object r1 = r0.get()
            p54 r1 = (defpackage.p54) r1
            if (r1 != 0) goto L12
            p54 r1 = new p54
            r1.<init>()
            r0.set(r1)
        L12:
            eb r0 = r4.b
            java.lang.Object r0 = r0.B
            q54 r0 = (defpackage.q54) r0
            r2 = 6
            int r2 = r0.a(r2)
            if (r2 == 0) goto L5e
            int r3 = r0.A
            int r2 = r2 + r3
            java.lang.Object r3 = r0.R
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r4 = r4.a
            int r4 = r4 * 4
            int r4 = r4 + r3
            java.lang.Object r2 = r0.R
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r4)
            int r2 = r2 + r4
            java.lang.Object r4 = r0.R
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r1.R = r4
            if (r4 == 0) goto L57
            r1.A = r2
            int r4 = r4.getInt(r2)
            int r2 = r2 - r4
            r1.B = r2
            java.lang.Object r4 = r1.R
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            short r4 = r4.getShort(r2)
            r1.L = r4
            return r1
        L57:
            r4 = 0
            r1.A = r4
            r1.B = r4
            r1.L = r4
        L5e:
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", id:"
            r0.append(r1)
            p54 r1 = r5.b()
            r2 = 4
            int r2 = r1.a(r2)
            r3 = 0
            if (r2 == 0) goto L29
            java.lang.Object r4 = r1.R
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r1 = r1.A
            int r2 = r2 + r1
            int r1 = r4.getInt(r2)
            goto L2a
        L29:
            r1 = r3
        L2a:
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ", codepoints:"
            r0.append(r1)
            p54 r1 = r5.b()
            r2 = 16
            int r2 = r1.a(r2)
            if (r2 == 0) goto L57
            int r4 = r1.A
            int r2 = r2 + r4
            java.lang.Object r4 = r1.R
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r4.getInt(r2)
            int r4 = r4 + r2
            java.lang.Object r1 = r1.R
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt(r4)
            goto L58
        L57:
            r1 = r3
        L58:
            if (r3 >= r1) goto L6d
            int r2 = r5.a(r3)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            int r3 = r3 + 1
            goto L58
        L6d:
            java.lang.String r5 = r0.toString()
            return r5
    }
}
