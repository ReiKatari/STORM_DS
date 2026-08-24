package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ey7  reason: default package */
/* loaded from: classes.dex */
public final class ey7 extends org.xml.sax.helpers.DefaultHandler {
    public final defpackage.j97 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public java.lang.String n;
    public defpackage.wm0 o;
    public java.lang.String p;
    public java.lang.String q;
    public java.lang.String r;
    public java.lang.String s;
    public java.lang.String t;
    public java.lang.String u;
    public java.lang.String v;
    public final java.lang.StringBuilder w;
    public final java.util.ArrayList x;
    public final java.util.ArrayList y;

    public ey7(defpackage.j97 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0.w = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.x = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.y = r1
            return
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] r1, int r2, int r3) {
            r0 = this;
            boolean r2 = r0.m
            if (r2 == 0) goto Lc
            if (r1 == 0) goto Lc
            java.lang.StringBuilder r0 = r0.w
            r2 = 0
            r0.append(r1, r2, r3)
        Lc:
            return
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
            r1 = this;
            j97 r1 = r1.a
            java.lang.Object r1 = r1.B
            eb r1 = (defpackage.eb) r1
            java.lang.Object r1 = r1.X
            n36 r1 = (defpackage.n36) r1
            lx3 r0 = new lx3
            r0.<init>()
            r1.i(r0)
            return
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r11 = this;
            boolean r12 = r11.b
            j97 r13 = r11.a
            java.lang.StringBuilder r0 = r11.w
            r1 = 0
            r2 = 0
            if (r12 == 0) goto L53
            boolean r12 = r11.c
            if (r12 == 0) goto L53
            java.lang.String r12 = r0.toString()
            java.lang.String r3 = "\\(.*?\\)"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            r3.getClass()
            java.lang.String r4 = ""
            java.util.regex.Matcher r12 = r3.matcher(r12)
            java.lang.String r12 = r12.replaceAll(r4)
            r12.getClass()
            java.lang.CharSequence r12 = defpackage.qs6.T0(r12)
            java.lang.String r12 = r12.toString()
            r11.n = r12
            r11.c = r2
            r12.getClass()
            r13.getClass()
            java.lang.Object r3 = r13.B
            eb r3 = (defpackage.eb) r3
            z r4 = new z
            java.lang.Object r3 = r3.B
            me.magnum.melonds.common.workers.CheatImportWorker r3 = (me.magnum.melonds.common.workers.CheatImportWorker) r3
            r5 = 16
            r4.<init>(r3, r12, r1, r5)
            vt1 r12 = defpackage.vt1.A
            java.lang.Object r12 = defpackage.hv.V(r12, r4)
            wm0 r12 = (defpackage.wm0) r12
            r11.o = r12
        L53:
            boolean r12 = r11.d
            if (r12 == 0) goto L139
            boolean r12 = r11.e
            r3 = 1
            if (r12 == 0) goto Lcc
            java.lang.String r12 = r0.toString()
            r11.p = r12
            r11.e = r2
            r13.getClass()
            java.lang.Object r4 = r13.B
            eb r4 = (defpackage.eb) r4
            java.lang.Object r5 = r4.B
            me.magnum.melonds.common.workers.CheatImportWorker r5 = (me.magnum.melonds.common.workers.CheatImportWorker) r5
            java.lang.Object r6 = r4.L
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L87
            java.lang.Object r4 = r4.R
            g45 r4 = (defpackage.g45) r4
            int r4 = r4.A
            double r7 = (double) r4
            long r9 = r6.longValue()
            double r9 = (double) r9
            double r7 = r7 / r9
            r9 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r7 = r7 * r9
            int r4 = (int) r7
            goto L88
        L87:
            r4 = r2
        L88:
            if (r6 != 0) goto L8c
            r6 = r3
            goto L8d
        L8c:
            r6 = r2
        L8d:
            wj2 r6 = r5.g(r12, r4, r6)
            r5.b(r6)
            float r4 = (float) r4
            r6 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r6
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            vr4 r6 = new vr4
            java.lang.String r7 = "progress_relative"
            r6.<init>(r7, r4)
            vr4 r4 = new vr4
            java.lang.String r7 = "progress_item"
            r4.<init>(r7, r12)
            vr4[] r12 = new defpackage.vr4[]{r6, r4}
            wb1 r4 = new wb1
            r4.<init>(r2, r2)
            r6 = r2
        Lb4:
            r7 = 2
            if (r6 >= r7) goto Lc5
            r7 = r12[r6]
            java.lang.Object r8 = r7.A
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r7.B
            r4.h(r7, r8)
            int r6 = r6 + 1
            goto Lb4
        Lc5:
            xb1 r12 = r4.e()
            r5.c(r12)
        Lcc:
            boolean r12 = r11.f
            if (r12 == 0) goto Lf1
            java.lang.String r12 = r0.toString()
            char[] r4 = new char[r3]
            r5 = 32
            r4[r2] = r5
            r5 = 6
            java.util.List r12 = defpackage.qs6.J0(r12, r4, r5)
            java.lang.Object r4 = r12.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r11.q = r4
            java.lang.Object r12 = r12.get(r3)
            java.lang.String r12 = (java.lang.String) r12
            r11.r = r12
            r11.f = r2
        Lf1:
            boolean r12 = r11.g
            if (r12 == 0) goto L101
            boolean r12 = r11.h
            if (r12 == 0) goto L101
            java.lang.String r12 = r0.toString()
            r11.s = r12
            r11.h = r2
        L101:
            boolean r12 = r11.i
            if (r12 == 0) goto L111
            boolean r12 = r11.j
            if (r12 == 0) goto L111
            java.lang.String r12 = r0.toString()
            r11.t = r12
            r11.j = r2
        L111:
            boolean r12 = r11.i
            if (r12 == 0) goto L127
            boolean r12 = r11.k
            if (r12 == 0) goto L127
            java.lang.String r12 = r0.toString()
            boolean r3 = defpackage.qs6.v0(r12)
            if (r3 != 0) goto L125
            r11.u = r12
        L125:
            r11.k = r2
        L127:
            boolean r12 = r11.i
            if (r12 == 0) goto L137
            boolean r12 = r11.l
            if (r12 == 0) goto L137
            java.lang.String r12 = r0.toString()
            r11.v = r12
            r11.l = r2
        L137:
            r11.m = r2
        L139:
            boolean r12 = r11.i
            java.util.ArrayList r0 = r11.x
            if (r12 == 0) goto L177
            java.lang.String r12 = "cheat"
            boolean r12 = defpackage.nb3.k(r14, r12)
            if (r12 == 0) goto L177
            r11.i = r2
            r11.j = r2
            r11.k = r2
            r11.l = r2
            me.magnum.melonds.domain.model.Cheat r3 = new me.magnum.melonds.domain.model.Cheat
            wm0 r12 = r11.o
            r12.getClass()
            java.lang.Long r12 = r12.a
            long r5 = r12.longValue()
            java.lang.String r7 = r11.t
            r7.getClass()
            java.lang.String r8 = r11.u
            java.lang.String r9 = r11.v
            r9.getClass()
            r10 = 0
            r4 = 0
            r3.<init>(r4, r5, r7, r8, r9, r10)
            r0.add(r3)
            r11.t = r1
            r11.u = r1
            r11.v = r1
            return
        L177:
            boolean r12 = r11.g
            java.util.ArrayList r3 = r11.y
            if (r12 == 0) goto L1a7
            java.lang.String r12 = "folder"
            boolean r12 = defpackage.nb3.k(r14, r12)
            if (r12 == 0) goto L1a7
            r11.g = r2
            r11.h = r2
            boolean r12 = r0.isEmpty()
            if (r12 != 0) goto L1a1
            an0 r12 = new an0
            java.lang.String r13 = r11.s
            r13.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r0)
            r12.<init>(r1, r13, r14)
            r3.add(r12)
        L1a1:
            r11.s = r1
            r0.clear()
            return
        L1a7:
            boolean r12 = r11.d
            if (r12 == 0) goto L1f1
            java.lang.String r12 = "game"
            boolean r12 = defpackage.nb3.k(r14, r12)
            if (r12 == 0) goto L1f1
            r11.d = r2
            r11.e = r2
            boolean r12 = r3.isEmpty()
            if (r12 != 0) goto L1ec
            cp2 r4 = new cp2
            java.lang.String r6 = r11.p
            r6.getClass()
            java.lang.String r7 = r11.q
            r7.getClass()
            java.lang.String r8 = r11.r
            r8.getClass()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r3)
            r5 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r13.getClass()
            java.lang.Object r12 = r13.B
            eb r12 = (defpackage.eb) r12
            z r13 = new z
            java.lang.Object r12 = r12.B
            me.magnum.melonds.common.workers.CheatImportWorker r12 = (me.magnum.melonds.common.workers.CheatImportWorker) r12
            r14 = 17
            r13.<init>(r12, r4, r1, r14)
            defpackage.hv.W(r13)
        L1ec:
            r3.clear()
            r11.p = r1
        L1f1:
            return
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(java.lang.String r1, java.lang.String r2, java.lang.String r3, org.xml.sax.Attributes r4) {
            r0 = this;
            boolean r1 = r0.b
            r2 = 1
            if (r1 != 0) goto L10
            java.lang.String r1 = "codelist"
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 == 0) goto Ld2
            r0.b = r2
            return
        L10:
            java.lang.String r4 = "name"
            if (r1 == 0) goto L22
            java.lang.String r1 = r0.n
            if (r1 != 0) goto L22
            boolean r1 = defpackage.nb3.k(r3, r4)
            if (r1 == 0) goto L22
            r0.c = r2
            r0.m = r2
        L22:
            boolean r1 = r0.d
            if (r1 != 0) goto L31
            java.lang.String r1 = "game"
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 == 0) goto Ld2
            r0.d = r2
            return
        L31:
            if (r1 == 0) goto L41
            java.lang.String r1 = r0.p
            if (r1 != 0) goto L41
            boolean r1 = defpackage.nb3.k(r3, r4)
            if (r1 == 0) goto L41
            r0.e = r2
            r0.m = r2
        L41:
            boolean r1 = r0.d
            if (r1 == 0) goto L55
            boolean r1 = r0.f
            if (r1 != 0) goto L55
            java.lang.String r1 = "gameid"
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 == 0) goto L55
            r0.f = r2
            r0.m = r2
        L55:
            boolean r1 = r0.g
            if (r1 != 0) goto L65
            java.lang.String r1 = "folder"
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 == 0) goto L65
            r0.g = r2
            r0.m = r2
        L65:
            boolean r1 = r0.g
            if (r1 == 0) goto L77
            java.lang.String r1 = r0.s
            if (r1 != 0) goto L77
            boolean r1 = defpackage.nb3.k(r3, r4)
            if (r1 == 0) goto L77
            r0.h = r2
            r0.m = r2
        L77:
            boolean r1 = r0.g
            if (r1 == 0) goto L8b
            boolean r1 = r0.i
            if (r1 != 0) goto L8b
            java.lang.String r1 = "cheat"
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 == 0) goto L8b
            r0.i = r2
            r0.m = r2
        L8b:
            boolean r1 = r0.i
            if (r1 == 0) goto L9d
            java.lang.String r1 = r0.t
            if (r1 != 0) goto L9d
            boolean r1 = defpackage.nb3.k(r3, r4)
            if (r1 == 0) goto L9d
            r0.j = r2
            r0.m = r2
        L9d:
            boolean r1 = r0.i
            if (r1 == 0) goto Lb1
            java.lang.String r1 = r0.u
            if (r1 != 0) goto Lb1
            java.lang.String r1 = "note"
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 == 0) goto Lb1
            r0.k = r2
            r0.m = r2
        Lb1:
            boolean r1 = r0.i
            if (r1 == 0) goto Lc5
            java.lang.String r1 = r0.v
            if (r1 != 0) goto Lc5
            java.lang.String r1 = "codes"
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 == 0) goto Lc5
            r0.l = r2
            r0.m = r2
        Lc5:
            boolean r1 = r0.m
            if (r1 == 0) goto Ld2
            java.lang.StringBuilder r0 = r0.w
            r0.getClass()
            r1 = 0
            r0.setLength(r1)
        Ld2:
            return
    }
}
