package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m42  reason: default package */
/* loaded from: classes.dex */
public final class m42 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public java.lang.Object d;
    public java.lang.Object e;

    public /* synthetic */ m42() {
            r1 = this;
            r0 = 3
            r1.a = r0
            r1.<init>()
            return
    }

    public m42(int r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r0 = -1
            r1.c = r0
            r1.b = r2
            return
    }

    public m42(java.lang.CharSequence r3, int r4, java.util.Locale r5) {
            r2 = this;
            r0 = 4
            r2.a = r0
            r2.<init>()
            r2.d = r3
            int r0 = r3.length()
            if (r0 < 0) goto Lf
            goto L14
        Lf:
            java.lang.String r0 = "input start index is outside the CharSequence"
            defpackage.q53.a(r0)
        L14:
            if (r4 < 0) goto L1d
            int r0 = r3.length()
            if (r4 > r0) goto L1d
            goto L22
        L1d:
            java.lang.String r0 = "input end index is outside the CharSequence"
            defpackage.q53.a(r0)
        L22:
            java.text.BreakIterator r5 = java.text.BreakIterator.getWordInstance(r5)
            r2.e = r5
            r0 = -50
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            r2.b = r0
            int r0 = r3.length()
            int r1 = r4 + 50
            int r0 = java.lang.Math.min(r0, r1)
            r2.c = r0
            nm0 r2 = new nm0
            r2.<init>(r4, r3)
            r5.setText(r2)
            return
    }

    public m42(defpackage.n42 r3, defpackage.m44 r4) {
            r2 = this;
            r0 = 0
            r2.a = r0
            r2.<init>()
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r2.d = r1
            r2.e = r3
            java.lang.Object r3 = r4.L
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 28
            int r4 = r3.getResourceId(r4, r0)
            r2.b = r4
            r4 = 53
            int r3 = r3.getResourceId(r4, r0)
            r2.c = r3
            return
    }

    public m42(defpackage.xi3 r2, int r3, int r4) {
            r1 = this;
            r0 = 2
            r1.a = r0
            r1.<init>()
            r1.e = r2
            r1.b = r3
            r2 = 1
            int r0 = r2 << r4
            int r0 = r0 - r2
            r1.c = r0
            int r3 = r3 + r4
            int r2 = r2 << r3
            yc1[] r2 = new defpackage.yc1[r2]
            r1.d = r2
            r2 = 0
        L17:
            java.lang.Object r3 = r1.d
            yc1[] r3 = (defpackage.yc1[]) r3
            int r4 = r3.length
            if (r2 >= r4) goto L30
            yc1 r4 = new yc1
            r4.<init>()
            r4.B = r1
            r0 = 768(0x300, float:1.076E-42)
            short[] r0 = new short[r0]
            r4.A = r0
            r3[r2] = r4
            int r2 = r2 + 1
            goto L17
        L30:
            return
    }

    public void a(int r5) {
            r4 = this;
            int r0 = r4.b
            int r4 = r4.c
            r1 = 0
            if (r5 > r4) goto La
            if (r0 > r5) goto La
            r1 = 1
        La:
            if (r1 != 0) goto L25
            java.lang.String r1 = ". Valid range is ["
            java.lang.String r2 = " , "
            java.lang.String r3 = "Invalid offset: "
            java.lang.StringBuilder r5 = defpackage.i61.q(r5, r0, r3, r1, r2)
            r5.append(r4)
            r4 = 93
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            defpackage.q53.a(r4)
        L25:
            return
    }

    public int b() {
            r3 = this;
            java.lang.Object r0 = r3.e
            ls0 r0 = (defpackage.ls0) r0
            java.lang.Object r1 = r3.d
            java.lang.String r1 = (java.lang.String) r1
            if (r0 != 0) goto Lf
            int r3 = r1.length()
            return r3
        Lf:
            int r1 = r1.length()
            int r2 = r3.c
            int r3 = r3.b
            int r2 = r2 - r3
            int r1 = r1 - r2
            int r3 = r0.b
            int r0 = r0.d()
            int r3 = r3 - r0
            int r3 = r3 + r1
            return r3
    }

    public boolean c(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r3.b
            r2 = 1
            int r1 = r1 + r2
            int r3 = r3.c
            if (r4 > r3) goto L3d
            if (r1 > r4) goto L3d
            int r3 = java.lang.Character.codePointBefore(r0, r4)
            boolean r3 = java.lang.Character.isLetterOrDigit(r3)
            if (r3 == 0) goto L19
            goto L3c
        L19:
            int r4 = r4 - r2
            char r3 = r0.charAt(r4)
            boolean r3 = java.lang.Character.isSurrogate(r3)
            if (r3 == 0) goto L25
            goto L3c
        L25:
            boolean r3 = defpackage.ws1.d()
            if (r3 == 0) goto L3d
            ws1 r3 = defpackage.ws1.a()
            int r1 = r3.c()
            if (r1 != r2) goto L3d
            int r3 = r3.b(r4, r0)
            r4 = -1
            if (r3 == r4) goto L3d
        L3c:
            return r2
        L3d:
            r3 = 0
            return r3
    }

    public boolean d(int r3) {
            r2 = this;
            int r0 = r2.b
            int r0 = r0 + 1
            int r1 = r2.c
            if (r3 > r1) goto L17
            if (r0 > r3) goto L17
            java.lang.Object r2 = r2.d
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = java.lang.Character.codePointBefore(r2, r3)
            boolean r2 = defpackage.yv7.b(r2)
            return r2
        L17:
            r2 = 0
            return r2
    }

    public boolean e(int r3) {
            r2 = this;
            r2.a(r3)
            java.lang.Object r0 = r2.e
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            boolean r0 = r0.isBoundary(r3)
            if (r0 == 0) goto L3f
            boolean r0 = r2.g(r3)
            if (r0 == 0) goto L23
            int r0 = r3 + (-1)
            boolean r0 = r2.g(r0)
            if (r0 == 0) goto L23
            int r0 = r3 + 1
            boolean r0 = r2.g(r0)
            if (r0 != 0) goto L3f
        L23:
            r0 = 1
            if (r3 <= 0) goto L3e
            java.lang.Object r1 = r2.d
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            int r1 = r1 - r0
            if (r3 >= r1) goto L3e
            boolean r1 = r2.f(r3)
            if (r1 != 0) goto L3f
            int r3 = r3 + r0
            boolean r2 = r2.f(r3)
            if (r2 != 0) goto L3f
        L3e:
            return r0
        L3f:
            r2 = 0
            return r2
    }

    public boolean f(int r5) {
            r4 = this;
            java.lang.Object r4 = r4.d
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r0 = r5 + (-1)
            char r1 = r4.charAt(r0)
            java.lang.Character$UnicodeBlock r1 = java.lang.Character.UnicodeBlock.of(r1)
            java.lang.Character$UnicodeBlock r2 = java.lang.Character.UnicodeBlock.HIRAGANA
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L26
            char r1 = r4.charAt(r5)
            java.lang.Character$UnicodeBlock r1 = java.lang.Character.UnicodeBlock.of(r1)
            java.lang.Character$UnicodeBlock r3 = java.lang.Character.UnicodeBlock.KATAKANA
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L44
        L26:
            char r5 = r4.charAt(r5)
            java.lang.Character$UnicodeBlock r5 = java.lang.Character.UnicodeBlock.of(r5)
            boolean r5 = defpackage.nb3.k(r5, r2)
            if (r5 == 0) goto L46
            char r4 = r4.charAt(r0)
            java.lang.Character$UnicodeBlock r4 = java.lang.Character.UnicodeBlock.of(r4)
            java.lang.Character$UnicodeBlock r5 = java.lang.Character.UnicodeBlock.KATAKANA
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 == 0) goto L46
        L44:
            r4 = 1
            return r4
        L46:
            r4 = 0
            return r4
    }

    public boolean g(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r3.b
            int r3 = r3.c
            if (r4 >= r3) goto L3b
            if (r1 > r4) goto L3b
            int r3 = java.lang.Character.codePointAt(r0, r4)
            boolean r3 = java.lang.Character.isLetterOrDigit(r3)
            r1 = 1
            if (r3 == 0) goto L18
            goto L3a
        L18:
            char r3 = r0.charAt(r4)
            boolean r3 = java.lang.Character.isSurrogate(r3)
            if (r3 == 0) goto L23
            goto L3a
        L23:
            boolean r3 = defpackage.ws1.d()
            if (r3 == 0) goto L3b
            ws1 r3 = defpackage.ws1.a()
            int r2 = r3.c()
            if (r2 != r1) goto L3b
            int r3 = r3.b(r4, r0)
            r4 = -1
            if (r3 == r4) goto L3b
        L3a:
            return r1
        L3b:
            r3 = 0
            return r3
    }

    public boolean h(int r3) {
            r2 = this;
            int r0 = r2.b
            int r1 = r2.c
            if (r3 >= r1) goto L15
            if (r0 > r3) goto L15
            java.lang.Object r2 = r2.d
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = java.lang.Character.codePointAt(r2, r3)
            boolean r2 = defpackage.yv7.b(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    public int i(int r2) {
            r1 = this;
            r1.a(r2)
            java.lang.Object r0 = r1.e
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            int r2 = r0.following(r2)
            int r0 = r2 + (-1)
            boolean r0 = r1.g(r0)
            if (r0 == 0) goto L24
            boolean r0 = r1.g(r2)
            if (r0 == 0) goto L24
            boolean r0 = r1.f(r2)
            if (r0 != 0) goto L24
            int r1 = r1.i(r2)
            return r1
        L24:
            return r2
    }

    public int j(int r2) {
            r1 = this;
            r1.a(r2)
            java.lang.Object r0 = r1.e
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            int r2 = r0.preceding(r2)
            boolean r0 = r1.g(r2)
            if (r0 == 0) goto L22
            boolean r0 = r1.c(r2)
            if (r0 == 0) goto L22
            boolean r0 = r1.f(r2)
            if (r0 != 0) goto L22
            int r1 = r1.j(r2)
            return r1
        L22:
            return r2
    }

    public void k(int r8, int r9, java.lang.String r10) {
            r7 = this;
            if (r8 > r9) goto L3
            goto L1c
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "start index must be less than or equal to end index: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = " > "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            defpackage.q53.a(r0)
        L1c:
            if (r8 < 0) goto L1f
            goto L30
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "start must be non-negative, but was "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            defpackage.q53.a(r0)
        L30:
            java.lang.Object r0 = r7.e
            ls0 r0 = (defpackage.ls0) r0
            r1 = 0
            if (r0 != 0) goto L92
            int r0 = r10.length()
            int r0 = r0 + 128
            r2 = 255(0xff, float:3.57E-43)
            int r0 = java.lang.Math.max(r2, r0)
            char[] r2 = new char[r0]
            r3 = 64
            int r4 = java.lang.Math.min(r8, r3)
            java.lang.Object r5 = r7.d
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.length()
            int r5 = r5 - r9
            int r3 = java.lang.Math.min(r5, r3)
            java.lang.Object r5 = r7.d
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r8 - r4
            r5.getClass()
            r5.getChars(r6, r8, r2, r1)
            java.lang.Object r8 = r7.d
            java.lang.String r8 = (java.lang.String) r8
            int r5 = r0 - r3
            int r3 = r3 + r9
            r8.getClass()
            r8.getChars(r9, r3, r2, r5)
            int r8 = r10.length()
            r10.getChars(r1, r8, r2, r4)
            ls0 r8 = new ls0
            int r9 = r10.length()
            int r9 = r9 + r4
            r10 = 1
            r8.<init>(r10)
            r8.b = r0
            r8.e = r2
            r8.c = r9
            r8.d = r5
            r7.e = r8
            r7.b = r6
            r7.c = r3
            return
        L92:
            int r2 = r7.b
            int r3 = r8 - r2
            int r2 = r9 - r2
            if (r3 < 0) goto L13f
            int r4 = r0.b
            int r5 = r0.d()
            int r4 = r4 - r5
            if (r2 <= r4) goto La5
            goto L13f
        La5:
            int r7 = r10.length()
            int r8 = r2 - r3
            int r7 = r7 - r8
            int r8 = r0.d()
            if (r7 > r8) goto Lb3
            goto Le4
        Lb3:
            int r8 = r0.d()
            int r7 = r7 - r8
            int r8 = r0.b
        Lba:
            int r8 = r8 * 2
            int r9 = r0.b
            int r9 = r8 - r9
            if (r9 >= r7) goto Lc3
            goto Lba
        Lc3:
            char[] r7 = new char[r8]
            java.lang.Object r9 = r0.e
            char[] r9 = (char[]) r9
            int r4 = r0.c
            java.lang.System.arraycopy(r9, r1, r7, r1, r4)
            int r9 = r0.b
            int r4 = r0.d
            int r9 = r9 - r4
            int r5 = r8 - r9
            java.lang.Object r6 = r0.e
            char[] r6 = (char[]) r6
            int r9 = r9 + r4
            int r9 = r9 - r4
            java.lang.System.arraycopy(r6, r4, r7, r5, r9)
            r0.e = r7
            r0.b = r8
            r0.d = r5
        Le4:
            int r7 = r0.c
            if (r3 >= r7) goto Lfd
            if (r2 > r7) goto Lfd
            int r7 = r7 - r2
            java.lang.Object r8 = r0.e
            char[] r8 = (char[]) r8
            int r9 = r0.d
            int r9 = r9 - r7
            java.lang.System.arraycopy(r8, r2, r8, r9, r7)
            r0.c = r3
            int r8 = r0.d
            int r8 = r8 - r7
            r0.d = r8
            goto L128
        Lfd:
            if (r3 >= r7) goto L10b
            if (r2 < r7) goto L10b
            int r7 = r0.d()
            int r7 = r7 + r2
            r0.d = r7
            r0.c = r3
            goto L128
        L10b:
            int r7 = r0.d()
            int r7 = r7 + r3
            int r8 = r0.d()
            int r8 = r8 + r2
            int r9 = r0.d
            int r7 = r7 - r9
            java.lang.Object r2 = r0.e
            char[] r2 = (char[]) r2
            int r3 = r0.c
            java.lang.System.arraycopy(r2, r9, r2, r3, r7)
            int r9 = r0.c
            int r9 = r9 + r7
            r0.c = r9
            r0.d = r8
        L128:
            java.lang.Object r7 = r0.e
            char[] r7 = (char[]) r7
            int r8 = r0.c
            int r9 = r10.length()
            r10.getChars(r1, r9, r7, r8)
            int r7 = r0.c
            int r8 = r10.length()
            int r8 = r8 + r7
            r0.c = r8
            return
        L13f:
            java.lang.String r0 = r7.toString()
            r7.d = r0
            r0 = 0
            r7.e = r0
            r0 = -1
            r7.b = r0
            r7.c = r0
            r7.k(r8, r9, r10)
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r5 = super.toString()
            return r5
        La:
            java.lang.Object r0 = r5.e
            ls0 r0 = (defpackage.ls0) r0
            java.lang.Object r1 = r5.d
            java.lang.String r1 = (java.lang.String) r1
            if (r0 != 0) goto L15
            goto L46
        L15:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r5.b
            r4 = 0
            r2.append(r1, r4, r3)
            java.lang.Object r1 = r0.e
            char[] r1 = (char[]) r1
            int r3 = r0.c
            r2.append(r1, r4, r3)
            java.lang.Object r1 = r0.e
            char[] r1 = (char[]) r1
            int r3 = r0.d
            int r0 = r0.b
            int r0 = r0 - r3
            r2.append(r1, r3, r0)
            java.lang.Object r0 = r5.d
            java.lang.String r0 = (java.lang.String) r0
            int r5 = r5.c
            int r1 = r0.length()
            r2.append(r0, r5, r1)
            java.lang.String r1 = r2.toString()
        L46:
            return r1
    }
}
