package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: az2  reason: default package */
/* loaded from: classes.dex */
public final class az2 extends defpackage.u {
    public static final java.util.regex.Pattern[][] e = null;
    public final defpackage.zy2 a;
    public final java.util.regex.Pattern b;
    public boolean c;
    public defpackage.zb d;

    static {
            r0 = 0
            java.util.regex.Pattern[] r1 = new java.util.regex.Pattern[]{r0, r0}
            java.lang.String r2 = "^<(?:script|pre|style)(?:\\s|>|$)"
            r3 = 2
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r4 = "</(?:script|pre|style)>"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r3)
            java.util.regex.Pattern[] r2 = new java.util.regex.Pattern[]{r2, r4}
            java.lang.String r4 = "^<!--"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.lang.String r5 = "-->"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.util.regex.Pattern[] r4 = new java.util.regex.Pattern[]{r4, r5}
            java.lang.String r5 = "^<[?]"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = "\\?>"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            java.util.regex.Pattern[] r5 = new java.util.regex.Pattern[]{r5, r6}
            java.lang.String r6 = "^<![A-Z]"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            java.lang.String r7 = ">"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)
            java.util.regex.Pattern[] r6 = new java.util.regex.Pattern[]{r6, r7}
            java.lang.String r7 = "^<!\\[CDATA\\["
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)
            java.lang.String r8 = "\\]\\]>"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)
            java.util.regex.Pattern[] r7 = new java.util.regex.Pattern[]{r7, r8}
            java.lang.String r8 = "^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8, r3)
            java.util.regex.Pattern[] r8 = new java.util.regex.Pattern[]{r8, r0}
            java.lang.String r9 = "^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r9, r3)
            java.util.regex.Pattern[] r0 = new java.util.regex.Pattern[]{r3, r0}
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r0
            java.util.regex.Pattern[][] r0 = new java.util.regex.Pattern[][]{r1, r2, r3, r4, r5, r6, r7, r8}
            defpackage.az2.e = r0
            return
    }

    public az2(java.util.regex.Pattern r4) {
            r3 = this;
            r3.<init>()
            zy2 r0 = new zy2
            r1 = 0
            r0.<init>(r1)
            r3.a = r0
            r0 = 0
            r3.c = r0
            zb r0 = new zb
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            r3.d = r0
            r3.b = r4
            return
    }

    @Override // defpackage.u
    public final void a(java.lang.CharSequence r4) {
            r3 = this;
            zb r0 = r3.d
            java.lang.Object r1 = r0.L
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            int r2 = r0.B
            if (r2 == 0) goto Lf
            r2 = 10
            r1.append(r2)
        Lf:
            r1.append(r4)
            int r1 = r0.B
            r2 = 1
            int r1 = r1 + r2
            r0.B = r1
            java.util.regex.Pattern r0 = r3.b
            if (r0 == 0) goto L28
            java.util.regex.Matcher r4 = r0.matcher(r4)
            boolean r4 = r4.find()
            if (r4 == 0) goto L28
            r3.c = r2
        L28:
            return
    }

    @Override // defpackage.u
    public final void c() {
            r1 = this;
            zb r0 = r1.d
            java.lang.Object r0 = r0.L
            r0 = 0
            r1.d = r0
            return
    }

    @Override // defpackage.u
    public final defpackage.a50 d() {
            r0 = this;
            zy2 r0 = r0.a
            return r0
    }

    @Override // defpackage.u
    public final defpackage.b50 g(defpackage.am1 r2) {
            r1 = this;
            boolean r0 = r1.c
            if (r0 == 0) goto L5
            goto Ld
        L5:
            boolean r0 = r2.h
            if (r0 == 0) goto Lf
            java.util.regex.Pattern r1 = r1.b
            if (r1 != 0) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            int r1 = r2.b
            b50 r1 = defpackage.b50.a(r1)
            return r1
    }
}
