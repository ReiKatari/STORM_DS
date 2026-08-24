package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l51  reason: default package */
/* loaded from: classes.dex */
public final class l51 implements defpackage.g14 {
    public final /* synthetic */ defpackage.m51 a;

    public l51(defpackage.m51 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.g14
    public final void a(defpackage.eb r21, defpackage.a21 r22) {
            r20 = this;
            r0 = r21
            r1 = r22
            vz6 r1 = (defpackage.vz6) r1
            java.lang.String r1 = r1.g
            java.lang.Object r2 = r0.R
            sn6 r2 = (defpackage.sn6) r2
            java.lang.Object r3 = r0.B
            d14 r3 = (defpackage.d14) r3
            java.lang.StringBuilder r4 = r2.A
            r4.append(r1)
            r4 = r20
            m51 r4 = r4.a
            java.util.ArrayList r4 = r4.a
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L19a
            int r5 = r0.H()
            int r6 = r1.length()
            int r5 = r5 - r6
            int r6 = r4.size()
            r7 = 0
            r8 = r7
        L30:
            if (r8 >= r6) goto L19a
            java.lang.Object r9 = r4.get(r8)
            int r8 = r8 + 1
            cw3 r9 = (defpackage.cw3) r9
            r9.getClass()
            ng0 r9 = r3.g
            java.lang.Class<mv3> r10 = defpackage.mv3.class
            java.util.Map r9 = r9.A
            java.lang.Object r9 = r9.get(r10)
            i50 r9 = (defpackage.i50) r9
            if (r9 != 0) goto L51
            r16 = r1
            r17 = r4
            goto L193
        L51:
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>(r1)
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            java.lang.Class<android.text.style.URLSpan> r13 = android.text.style.URLSpan.class
            r14 = 1
            if (r11 < r12) goto L69
            boolean r14 = android.text.util.Linkify.addLinks(r10, r14)
            r16 = r1
            r17 = r4
            goto L14d
        L69:
            int r11 = r10.length()
            java.lang.Object[] r11 = r10.getSpans(r7, r11, r13)
            android.text.style.URLSpan[] r11 = (android.text.style.URLSpan[]) r11
            int r12 = r11.length
            int r12 = r12 - r14
        L75:
            if (r12 < 0) goto L7f
            r15 = r11[r12]
            r10.removeSpan(r15)
            int r12 = r12 + (-1)
            goto L75
        L7f:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.regex.Pattern r12 = defpackage.ku4.a
            java.lang.String r15 = "https://"
            java.lang.String r14 = "rtsp://"
            java.lang.String r7 = "http://"
            java.lang.String[] r7 = new java.lang.String[]{r7, r15, r14}
            android.text.util.Linkify$MatchFilter r14 = android.text.util.Linkify.sUrlMatchFilter
            defpackage.hf.Q(r11, r10, r12, r7, r14)
            int r7 = r10.length()
            r12 = 0
            java.lang.Object[] r7 = r10.getSpans(r12, r7, r13)
            android.text.style.URLSpan[] r7 = (android.text.style.URLSpan[]) r7
            int r12 = r7.length
            r14 = 0
        La2:
            if (r14 >= r12) goto Lc7
            r15 = r7[r14]
            r16 = r1
            bw3 r1 = new bw3
            r1.<init>()
            r1.a = r15
            r17 = r4
            int r4 = r10.getSpanStart(r15)
            r1.c = r4
            int r4 = r10.getSpanEnd(r15)
            r1.d = r4
            r11.add(r1)
            int r14 = r14 + 1
            r1 = r16
            r4 = r17
            goto La2
        Lc7:
            r16 = r1
            r17 = r4
            bk r1 = defpackage.hf.n
            java.util.Collections.sort(r11, r1)
            int r1 = r11.size()
            r12 = 0
        Ld5:
            int r4 = r1 + (-1)
            if (r12 >= r4) goto L120
            java.lang.Object r4 = r11.get(r12)
            bw3 r4 = (defpackage.bw3) r4
            int r7 = r12 + 1
            java.lang.Object r14 = r11.get(r7)
            bw3 r14 = (defpackage.bw3) r14
            int r15 = r4.c
            r18 = r1
            int r1 = r14.c
            if (r15 > r1) goto L11c
            int r4 = r4.d
            if (r4 <= r1) goto L11c
            int r14 = r14.d
            r19 = r1
            r1 = -1
            if (r14 > r4) goto Lfc
        Lfa:
            r4 = r7
            goto L107
        Lfc:
            int r4 = r4 - r15
            int r14 = r14 - r19
            if (r4 <= r14) goto L102
            goto Lfa
        L102:
            if (r4 >= r14) goto L106
            r4 = r12
            goto L107
        L106:
            r4 = r1
        L107:
            if (r4 == r1) goto L11c
            java.lang.Object r1 = r11.get(r4)
            bw3 r1 = (defpackage.bw3) r1
            android.text.style.URLSpan r1 = r1.a
            if (r1 == 0) goto L116
            r10.removeSpan(r1)
        L116:
            r11.remove(r4)
            int r1 = r18 + (-1)
            goto Ld5
        L11c:
            r12 = r7
            r1 = r18
            goto Ld5
        L120:
            int r1 = r11.size()
            if (r1 != 0) goto L128
            r14 = 0
            goto L14d
        L128:
            int r1 = r11.size()
            r12 = 0
        L12d:
            if (r12 >= r1) goto L14c
            java.lang.Object r4 = r11.get(r12)
            int r12 = r12 + 1
            bw3 r4 = (defpackage.bw3) r4
            android.text.style.URLSpan r7 = r4.a
            if (r7 != 0) goto L12d
            java.lang.String r7 = r4.b
            int r14 = r4.c
            int r4 = r4.d
            android.text.style.URLSpan r15 = new android.text.style.URLSpan
            r15.<init>(r7)
            r7 = 33
            r10.setSpan(r15, r14, r4, r7)
            goto L12d
        L14c:
            r14 = 1
        L14d:
            if (r14 == 0) goto L193
            int r1 = r10.length()
            r12 = 0
            java.lang.Object[] r1 = r10.getSpans(r12, r1, r13)
            android.text.style.URLSpan[] r1 = (android.text.style.URLSpan[]) r1
            if (r1 == 0) goto L193
            int r4 = r1.length
            if (r4 <= 0) goto L193
            java.lang.Object r4 = r0.L
            ng3 r4 = (defpackage.ng3) r4
            int r7 = r1.length
            r11 = r12
        L165:
            if (r11 >= r7) goto L193
            r13 = r1[r11]
            h45 r14 = defpackage.u24.h
            java.lang.String r15 = r13.getURL()
            r14.b(r4, r15)
            java.lang.Object r14 = r9.a(r3, r4)
            int r15 = r10.getSpanStart(r13)
            int r15 = r15 + r5
            int r13 = r10.getSpanEnd(r13)
            int r13 = r13 + r5
            java.lang.StringBuilder r12 = r2.A
            int r12 = r12.length()
            if (r13 <= r15) goto L18f
            if (r15 < 0) goto L18f
            if (r13 > r12) goto L18f
            defpackage.sn6.c(r2, r14, r15, r13)
        L18f:
            int r11 = r11 + 1
            r12 = 0
            goto L165
        L193:
            r1 = r16
            r4 = r17
            r7 = 0
            goto L30
        L19a:
            return
    }
}
