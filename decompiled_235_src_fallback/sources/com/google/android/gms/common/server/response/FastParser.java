package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastJsonResponse;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FastParser<T extends com.google.android.gms.common.server.response.FastJsonResponse> {
    private static final char[] zaa = null;
    private static final char[] zab = null;
    private static final char[] zac = null;
    private static final char[] zad = null;
    private static final char[] zae = null;
    private static final char[] zaf = null;
    private static final com.google.android.gms.common.server.response.zai zag = null;
    private static final com.google.android.gms.common.server.response.zai zah = null;
    private static final com.google.android.gms.common.server.response.zai zai = null;
    private static final com.google.android.gms.common.server.response.zai zaj = null;
    private static final com.google.android.gms.common.server.response.zai zak = null;
    private static final com.google.android.gms.common.server.response.zai zal = null;
    private static final com.google.android.gms.common.server.response.zai zam = null;
    private static final com.google.android.gms.common.server.response.zai zan = null;
    private final char[] zao;
    private final char[] zap;
    private final char[] zaq;
    private final java.lang.StringBuilder zar;
    private final java.lang.StringBuilder zas;
    private final java.util.Stack zat;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class ParseException extends java.lang.Exception {
        public ParseException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public ParseException(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                java.lang.String r1 = "Error instantiating inner object"
                r0.<init>(r1, r2)
                return
        }

        public ParseException(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            r0 = 3
            char[] r1 = new char[r0]
            r1 = {x006a: FILL_ARRAY_DATA  , data: [117, 108, 108} // fill-array
            com.google.android.gms.common.server.response.FastParser.zaa = r1
            char[] r0 = new char[r0]
            r0 = {x0072: FILL_ARRAY_DATA  , data: [114, 117, 101} // fill-array
            com.google.android.gms.common.server.response.FastParser.zab = r0
            r0 = 4
            char[] r1 = new char[r0]
            r1 = {x007a: FILL_ARRAY_DATA  , data: [114, 117, 101, 34} // fill-array
            com.google.android.gms.common.server.response.FastParser.zac = r1
            char[] r0 = new char[r0]
            r0 = {x0082: FILL_ARRAY_DATA  , data: [97, 108, 115, 101} // fill-array
            com.google.android.gms.common.server.response.FastParser.zad = r0
            r0 = 5
            char[] r0 = new char[r0]
            r0 = {x008a: FILL_ARRAY_DATA  , data: [97, 108, 115, 101, 34} // fill-array
            com.google.android.gms.common.server.response.FastParser.zae = r0
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 10
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.common.server.response.FastParser.zaf = r0
            com.google.android.gms.common.server.response.zaa r0 = new com.google.android.gms.common.server.response.zaa
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zag = r0
            com.google.android.gms.common.server.response.zab r0 = new com.google.android.gms.common.server.response.zab
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zah = r0
            com.google.android.gms.common.server.response.zac r0 = new com.google.android.gms.common.server.response.zac
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zai = r0
            com.google.android.gms.common.server.response.zad r0 = new com.google.android.gms.common.server.response.zad
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zaj = r0
            com.google.android.gms.common.server.response.zae r0 = new com.google.android.gms.common.server.response.zae
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zak = r0
            com.google.android.gms.common.server.response.zaf r0 = new com.google.android.gms.common.server.response.zaf
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zal = r0
            com.google.android.gms.common.server.response.zag r0 = new com.google.android.gms.common.server.response.zag
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zam = r0
            com.google.android.gms.common.server.response.zah r0 = new com.google.android.gms.common.server.response.zah
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zan = r0
            return
    }

    public FastParser() {
            r3 = this;
            r3.<init>()
            r0 = 1
            char[] r0 = new char[r0]
            r3.zao = r0
            r0 = 32
            char[] r1 = new char[r0]
            r3.zap = r1
            r1 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r1]
            r3.zaq = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r3.zar = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r3.zas = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r3.zat = r0
            return
    }

    private static final java.lang.String zaA(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, char[] r11) {
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = r0
            r2 = r1
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L60
            r4 = r0
        L12:
            if (r4 >= r3) goto L58
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L2b
            if (r11 == 0) goto L23
            char r6 = r11[r0]
            if (r6 != r5) goto L23
            goto L2b
        L23:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected control character while reading string"
            r8.<init>(r9)
            throw r8
        L2b:
            int r6 = r4 + 1
            r7 = 34
            if (r5 != r7) goto L4f
            if (r1 != 0) goto L4d
            r10.append(r9, r0, r4)
            r8.reset()
            long r0 = (long) r6
            r8.skip(r0)
            if (r2 == 0) goto L48
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.JsonUtils.unescapeString(r8)
            return r8
        L48:
            java.lang.String r8 = r10.toString()
            return r8
        L4d:
            r1 = r0
            goto L56
        L4f:
            r4 = 92
            if (r5 != r4) goto L4d
            r1 = r1 ^ 1
            r2 = 1
        L56:
            r4 = r6
            goto L12
        L58:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L60:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected EOF while parsing string"
            r8.<init>(r9)
            throw r8
    }

    public static /* bridge */ /* synthetic */ double zaa(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            double r0 = r0.zaj(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ float zab(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            float r0 = r0.zak(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ int zac(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            int r0 = r0.zal(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ long zad(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            long r0 = r0.zan(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String zae(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            java.lang.String r0 = r0.zao(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.math.BigDecimal zaf(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            java.math.BigDecimal r0 = r0.zas(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.math.BigInteger zag(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            java.math.BigInteger r0 = r0.zat(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zah(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1, boolean r2) {
            r2 = 0
            boolean r0 = r0.zay(r1, r2)
            return r0
    }

    private final char zai(java.io.BufferedReader r5) {
            r4 = this;
            char[] r0 = r4.zao
            int r0 = r5.read(r0)
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L20
        La:
            char[] r0 = r4.zao
            char r0 = r0[r1]
            boolean r0 = java.lang.Character.isWhitespace(r0)
            char[] r3 = r4.zao
            if (r0 == 0) goto L1d
            int r0 = r5.read(r3)
            if (r0 != r2) goto La
            goto L20
        L1d:
            char r4 = r3[r1]
            return r4
        L20:
            return r1
    }

    private final double zaj(java.io.BufferedReader r3) {
            r2 = this;
            char[] r0 = r2.zaq
            int r3 = r2.zam(r3, r0)
            if (r3 != 0) goto Lb
            r2 = 0
            return r2
        Lb:
            char[] r2 = r2.zaq
            java.lang.String r0 = new java.lang.String
            r1 = 0
            r0.<init>(r2, r1, r3)
            double r2 = java.lang.Double.parseDouble(r0)
            return r2
    }

    private final float zak(java.io.BufferedReader r3) {
            r2 = this;
            char[] r0 = r2.zaq
            int r3 = r2.zam(r3, r0)
            if (r3 != 0) goto La
            r2 = 0
            return r2
        La:
            char[] r2 = r2.zaq
            java.lang.String r0 = new java.lang.String
            r1 = 0
            r0.<init>(r2, r1, r3)
            float r2 = java.lang.Float.parseFloat(r0)
            return r2
    }

    private final int zal(java.io.BufferedReader r11) {
            r10 = this;
            char[] r0 = r10.zaq
            int r11 = r10.zam(r11, r0)
            r0 = 0
            if (r11 != 0) goto La
            return r0
        La:
            char[] r10 = r10.zaq
            if (r11 <= 0) goto L77
            char r1 = r10[r0]
            r2 = 45
            if (r1 != r2) goto L17
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L1a
        L17:
            r3 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        L1a:
            r4 = 1
            if (r1 != r2) goto L1f
            r1 = r4
            goto L20
        L1f:
            r1 = r0
        L20:
            java.lang.String r2 = "Unexpected non-digit character"
            r5 = 10
            if (r1 >= r11) goto L38
            int r0 = r1 + 1
            char r6 = r10[r1]
            int r6 = java.lang.Character.digit(r6, r5)
            if (r6 < 0) goto L32
            int r6 = -r6
            goto L3a
        L32:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r10.<init>(r2)
            throw r10
        L38:
            r6 = r0
            r0 = r1
        L3a:
            if (r0 >= r11) goto L68
            int r7 = r0 + 1
            char r0 = r10[r0]
            int r0 = java.lang.Character.digit(r0, r5)
            if (r0 < 0) goto L62
            r8 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            java.lang.String r9 = "Number too large"
            if (r6 < r8) goto L5c
            int r6 = r6 * 10
            int r8 = r3 + r0
            if (r6 < r8) goto L56
            int r6 = r6 - r0
            r0 = r7
            goto L3a
        L56:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r10.<init>(r9)
            throw r10
        L5c:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r10.<init>(r9)
            throw r10
        L62:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r10.<init>(r2)
            throw r10
        L68:
            if (r1 == 0) goto L75
            if (r0 <= r4) goto L6d
            return r6
        L6d:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r11 = "No digits to parse"
            r10.<init>(r11)
            throw r10
        L75:
            int r10 = -r6
            return r10
        L77:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r11 = "No number to parse"
            r10.<init>(r11)
            throw r10
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final int zam(java.io.BufferedReader r10, char[] r11) {
            r9 = this;
            char r0 = r9.zai(r10)
            java.lang.String r1 = "Unexpected EOF"
            if (r0 == 0) goto L9c
            r2 = 44
            if (r0 == r2) goto L94
            r3 = 110(0x6e, float:1.54E-43)
            r4 = 0
            if (r0 != r3) goto L17
            char[] r11 = com.google.android.gms.common.server.response.FastParser.zaa
            r9.zax(r10, r11)
            return r4
        L17:
            r9 = 1024(0x400, float:1.435E-42)
            r10.mark(r9)
            r3 = 34
            r5 = -1
            r6 = 1
            if (r0 != r3) goto L55
            r0 = r4
            r2 = r0
        L24:
            if (r0 >= r9) goto L84
            int r7 = r10.read(r11, r0, r6)
            if (r7 == r5) goto L84
            char r7 = r11[r0]
            boolean r8 = java.lang.Character.isISOControl(r7)
            if (r8 != 0) goto L4d
            int r8 = r0 + 1
            if (r7 != r3) goto L44
            if (r2 == 0) goto L3c
        L3a:
            r2 = r4
            goto L4b
        L3c:
            r10.reset()
            long r1 = (long) r8
            r10.skip(r1)
            return r0
        L44:
            r0 = 92
            if (r7 != r0) goto L3a
            r0 = r2 ^ 1
            r2 = r0
        L4b:
            r0 = r8
            goto L24
        L4d:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Unexpected control character while reading string"
            r9.<init>(r10)
            throw r9
        L55:
            r11[r4] = r0
            r0 = r6
        L58:
            if (r0 >= r9) goto L84
            int r3 = r10.read(r11, r0, r6)
            if (r3 == r5) goto L84
            char r3 = r11[r0]
            r7 = 125(0x7d, float:1.75E-43)
            if (r3 == r7) goto L78
            if (r3 == r2) goto L78
            boolean r3 = java.lang.Character.isWhitespace(r3)
            if (r3 != 0) goto L78
            char r3 = r11[r0]
            r7 = 93
            if (r3 != r7) goto L75
            goto L78
        L75:
            int r0 = r0 + 1
            goto L58
        L78:
            r10.reset()
            int r9 = r0 + (-1)
            long r1 = (long) r9
            r10.skip(r1)
            r11[r0] = r4
            return r0
        L84:
            if (r0 != r9) goto L8e
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Absurdly long value"
            r9.<init>(r10)
            throw r9
        L8e:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r9.<init>(r1)
            throw r9
        L94:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Missing value"
            r9.<init>(r10)
            throw r9
        L9c:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r9.<init>(r1)
            throw r9
    }

    private final long zan(java.io.BufferedReader r19) {
            r18 = this;
            r0 = r18
            char[] r1 = r0.zaq
            r2 = r19
            int r1 = r0.zam(r2, r1)
            r2 = 0
            if (r1 != 0) goto Lf
            return r2
        Lf:
            char[] r0 = r0.zaq
            if (r1 <= 0) goto L86
            r4 = 0
            char r5 = r0[r4]
            r6 = 45
            if (r5 != r6) goto L1d
            r7 = -9223372036854775808
            goto L22
        L1d:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L22:
            r9 = 1
            if (r5 != r6) goto L26
            r4 = r9
        L26:
            java.lang.String r5 = "Unexpected non-digit character"
            r6 = 10
            if (r4 >= r1) goto L3f
            int r2 = r4 + 1
            char r3 = r0[r4]
            int r3 = java.lang.Character.digit(r3, r6)
            if (r3 < 0) goto L39
            int r3 = -r3
            long r10 = (long) r3
            goto L41
        L39:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r0.<init>(r5)
            throw r0
        L3f:
            r10 = r2
            r2 = r4
        L41:
            if (r2 >= r1) goto L77
            int r3 = r2 + 1
            char r2 = r0[r2]
            int r2 = java.lang.Character.digit(r2, r6)
            if (r2 < 0) goto L71
            r12 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            java.lang.String r13 = "Number too large"
            if (r12 < 0) goto L6b
            r14 = 10
            long r10 = r10 * r14
            long r14 = (long) r2
            long r16 = r7 + r14
            int r2 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r2 < 0) goto L65
            long r10 = r10 - r14
            r2 = r3
            goto L41
        L65:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r0.<init>(r13)
            throw r0
        L6b:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r0.<init>(r13)
            throw r0
        L71:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r0.<init>(r5)
            throw r0
        L77:
            if (r4 == 0) goto L84
            if (r2 <= r9) goto L7c
            return r10
        L7c:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r1 = "No digits to parse"
            r0.<init>(r1)
            throw r0
        L84:
            long r0 = -r10
            return r0
        L86:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r1 = "No number to parse"
            r0.<init>(r1)
            throw r0
    }

    private final java.lang.String zao(java.io.BufferedReader r4) {
            r3 = this;
            char[] r0 = r3.zap
            java.lang.StringBuilder r1 = r3.zar
            r2 = 0
            java.lang.String r3 = r3.zap(r4, r0, r1, r2)
            return r3
    }

    private final java.lang.String zap(java.io.BufferedReader r3, char[] r4, java.lang.StringBuilder r5, char[] r6) {
            r2 = this;
            char r0 = r2.zai(r3)
            r1 = 34
            if (r0 == r1) goto L1b
            r4 = 110(0x6e, float:1.54E-43)
            if (r0 != r4) goto L13
            char[] r4 = com.google.android.gms.common.server.response.FastParser.zaa
            r2.zax(r3, r4)
            r2 = 0
            return r2
        L13:
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r3 = "Expected string"
            r2.<init>(r3)
            throw r2
        L1b:
            java.lang.String r2 = zaA(r3, r4, r5, r6)
            return r2
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final java.lang.String zaq(java.io.BufferedReader r5) {
            r4 = this;
            java.util.Stack r0 = r4.zat
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.push(r2)
            char r0 = r4.zai(r5)
            r2 = 34
            r3 = 0
            if (r0 == r2) goto L31
            r5 = 93
            if (r0 == r5) goto L25
            r5 = 125(0x7d, float:1.75E-43)
            if (r0 != r5) goto L1f
            r4.zaw(r1)
            return r3
        L1f:
            java.lang.String r4 = "Unexpected token: "
            defpackage.e41.d(r0, r4)
            return r3
        L25:
            r4.zaw(r1)
            r5 = 1
            r4.zaw(r5)
            r5 = 5
            r4.zaw(r5)
            return r3
        L31:
            java.util.Stack r0 = r4.zat
            r1 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.push(r2)
            char[] r0 = r4.zap
            java.lang.StringBuilder r2 = r4.zar
            java.lang.String r0 = zaA(r5, r0, r2, r3)
            r4.zaw(r1)
            char r4 = r4.zai(r5)
            r5 = 58
            if (r4 != r5) goto L4f
            return r0
        L4f:
            com.google.android.gms.common.server.response.FastParser$ParseException r4 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r5 = "Expected key/value separator"
            r4.<init>(r5)
            throw r4
    }

    private final java.lang.String zar(java.io.BufferedReader r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1024(0x400, float:1.435E-42)
            r1.mark(r2)
            char r2 = r17.zai(r18)
            r3 = 0
            r4 = 92
            java.lang.String r5 = "Unexpected token "
            r6 = 125(0x7d, float:1.75E-43)
            r7 = 44
            r8 = 0
            r9 = 1
            r10 = 34
            if (r2 == r10) goto Lc6
            if (r2 == r7) goto Lbe
            r11 = 32
            r12 = 91
            if (r2 == r12) goto L60
            r4 = 123(0x7b, float:1.72E-43)
            if (r2 == r4) goto L32
            r1.reset()
            char[] r2 = r0.zaq
            r0.zam(r1, r2)
            goto Ldd
        L32:
            java.util.Stack r2 = r0.zat
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r2.push(r4)
            r1.mark(r11)
            char r2 = r17.zai(r18)
            if (r2 != r6) goto L49
            r0.zaw(r9)
            goto Ldd
        L49:
            if (r2 != r10) goto L5c
            r1.reset()
            r17.zaq(r18)
        L51:
            java.lang.String r2 = r17.zar(r18)
            if (r2 != 0) goto L51
            r0.zaw(r9)
            goto Ldd
        L5c:
            defpackage.e41.d(r2, r5)
            return r3
        L60:
            java.util.Stack r2 = r0.zat
            r13 = 5
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r2.push(r14)
            r1.mark(r11)
            char r2 = r17.zai(r18)
            r11 = 93
            if (r2 != r11) goto L7a
            r0.zaw(r13)
            goto Ldd
        L7a:
            r1.reset()
            r2 = r8
            r14 = r2
        L7f:
            if (r9 <= 0) goto Lba
            char r15 = r17.zai(r18)
            if (r15 == 0) goto Lb2
            boolean r16 = java.lang.Character.isISOControl(r15)
            if (r16 != 0) goto Laa
            if (r15 != r10) goto L94
            if (r14 != 0) goto L93
            r2 = r2 ^ 1
        L93:
            r15 = r10
        L94:
            if (r15 != r12) goto L9b
            if (r2 != 0) goto L9a
            int r9 = r9 + 1
        L9a:
            r15 = r12
        L9b:
            if (r15 != r11) goto La1
            if (r2 != 0) goto La1
            int r9 = r9 + (-1)
        La1:
            if (r15 != r4) goto La8
            if (r2 == 0) goto La8
            r14 = r14 ^ 1
            goto L7f
        La8:
            r14 = r8
            goto L7f
        Laa:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r1 = "Unexpected control character while reading array"
            r0.<init>(r1)
            throw r0
        Lb2:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r1 = "Unexpected EOF while parsing array"
            r0.<init>(r1)
            throw r0
        Lba:
            r0.zaw(r13)
            goto Ldd
        Lbe:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r1 = "Missing value"
            r0.<init>(r1)
            throw r0
        Lc6:
            char[] r2 = r0.zao
            int r2 = r1.read(r2)
            java.lang.String r11 = "Unexpected EOF while parsing string"
            r12 = -1
            if (r2 == r12) goto L11e
            char[] r2 = r0.zao
            char r2 = r2[r8]
            r13 = r8
        Ld6:
            if (r2 != r10) goto Lf6
            if (r13 == 0) goto Ldd
            r13 = r9
            r2 = r10
            goto Lf6
        Ldd:
            char r2 = r17.zai(r18)
            r4 = 2
            if (r2 == r7) goto Lee
            if (r2 != r6) goto Lea
            r0.zaw(r4)
            return r3
        Lea:
            defpackage.e41.d(r2, r5)
            return r3
        Lee:
            r0.zaw(r4)
            java.lang.String r0 = r17.zaq(r18)
            return r0
        Lf6:
            if (r2 != r4) goto Lfc
            r2 = r13 ^ 1
            r13 = r2
            goto Lfd
        Lfc:
            r13 = r8
        Lfd:
            char[] r2 = r0.zao
            int r2 = r1.read(r2)
            if (r2 == r12) goto L118
            char[] r2 = r0.zao
            char r2 = r2[r8]
            boolean r14 = java.lang.Character.isISOControl(r2)
            if (r14 != 0) goto L110
            goto Ld6
        L110:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r1 = "Unexpected control character while reading string"
            r0.<init>(r1)
            throw r0
        L118:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r0.<init>(r11)
            throw r0
        L11e:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r0.<init>(r11)
            throw r0
    }

    private final java.math.BigDecimal zas(java.io.BufferedReader r4) {
            r3 = this;
            char[] r0 = r3.zaq
            int r4 = r3.zam(r4, r0)
            if (r4 != 0) goto La
            r3 = 0
            return r3
        La:
            char[] r3 = r3.zaq
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = new java.lang.String
            r2 = 0
            r1.<init>(r3, r2, r4)
            r0.<init>(r1)
            return r0
    }

    private final java.math.BigInteger zat(java.io.BufferedReader r4) {
            r3 = this;
            char[] r0 = r3.zaq
            int r4 = r3.zam(r4, r0)
            if (r4 != 0) goto La
            r3 = 0
            return r3
        La:
            char[] r3 = r3.zaq
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = new java.lang.String
            r2 = 0
            r1.<init>(r3, r2, r4)
            r0.<init>(r1)
            return r0
    }

    private final java.util.ArrayList zau(java.io.BufferedReader r5, com.google.android.gms.common.server.response.zai r6) {
            r4 = this;
            char r0 = r4.zai(r5)
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto Lf
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zaa
            r4.zax(r5, r6)
            r4 = 0
            return r4
        Lf:
            r1 = 91
            if (r0 != r1) goto L4c
            java.util.Stack r0 = r4.zat
            r1 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.push(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L22:
            r2 = 1024(0x400, float:1.435E-42)
            r5.mark(r2)
            char r2 = r4.zai(r5)
            if (r2 == 0) goto L44
            r3 = 44
            if (r2 == r3) goto L22
            r3 = 93
            if (r2 == r3) goto L40
            r5.reset()
            java.lang.Object r2 = r6.zaa(r4, r5)
            r0.add(r2)
            goto L22
        L40:
            r4.zaw(r1)
            return r0
        L44:
            com.google.android.gms.common.server.response.FastParser$ParseException r4 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r5 = "Unexpected EOF"
            r4.<init>(r5)
            throw r4
        L4c:
            com.google.android.gms.common.server.response.FastParser$ParseException r4 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r5 = "Expected start of array"
            r4.<init>(r5)
            throw r4
    }

    private final java.util.ArrayList zav(java.io.BufferedReader r11, com.google.android.gms.common.server.response.FastJsonResponse.Field r12) {
            r10 = this;
            java.lang.String r0 = "Error instantiating inner object"
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            char r3 = r10.zai(r11)
            r4 = 5
            r5 = 93
            if (r3 == r5) goto L76
            r6 = 110(0x6e, float:1.54E-43)
            r7 = 0
            if (r3 == r6) goto L6d
            java.lang.String r6 = "Unexpected token: "
            r8 = 123(0x7b, float:1.72E-43)
            if (r3 != r8) goto L69
            java.util.Stack r3 = r10.zat
            r3.push(r1)
        L25:
            com.google.android.gms.common.server.response.FastJsonResponse r3 = r12.zad()     // Catch: java.lang.IllegalAccessException -> L58 java.lang.InstantiationException -> L5a
            boolean r9 = r10.zaz(r11, r3)     // Catch: java.lang.IllegalAccessException -> L58 java.lang.InstantiationException -> L5a
            if (r9 == 0) goto L5c
            r2.add(r3)     // Catch: java.lang.IllegalAccessException -> L58 java.lang.InstantiationException -> L5a
            char r3 = r10.zai(r11)
            r9 = 44
            if (r3 == r9) goto L44
            if (r3 != r5) goto L40
            r10.zaw(r4)
            return r2
        L40:
            defpackage.e41.d(r3, r6)
            return r7
        L44:
            char r3 = r10.zai(r11)
            if (r3 != r8) goto L50
            java.util.Stack r3 = r10.zat
            r3.push(r1)
            goto L25
        L50:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r11 = "Expected start of next object in array"
            r10.<init>(r11)
            throw r10
        L58:
            r10 = move-exception
            goto L5d
        L5a:
            r10 = move-exception
            goto L63
        L5c:
            return r2
        L5d:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r11.<init>(r0, r10)
            throw r11
        L63:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r11.<init>(r0, r10)
            throw r11
        L69:
            defpackage.e41.d(r3, r6)
            return r7
        L6d:
            char[] r12 = com.google.android.gms.common.server.response.FastParser.zaa
            r10.zax(r11, r12)
            r10.zaw(r4)
            return r7
        L76:
            r10.zaw(r4)
            return r2
    }

    private final void zaw(int r4) {
            r3 = this;
            java.util.Stack r0 = r3.zat
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "Expected state "
            if (r0 != 0) goto L25
            java.util.Stack r3 = r3.zat
            java.lang.Object r3 = r3.pop()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != r4) goto L19
            return
        L19:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = " but had "
            java.lang.String r3 = defpackage.lb1.j(r1, r4, r3, r2)
            r0.<init>(r3)
            throw r0
        L25:
            com.google.android.gms.common.server.response.FastParser$ParseException r3 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = " but had empty stack"
            java.lang.String r4 = defpackage.lb1.k(r1, r4, r0)
            r3.<init>(r4)
            throw r3
    }

    private final void zax(java.io.BufferedReader r7, char[] r8) {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.length
            if (r1 >= r2) goto L31
            char[] r3 = r6.zap
            int r2 = r2 - r1
            int r2 = r7.read(r3, r0, r2)
            r3 = -1
            if (r2 == r3) goto L29
            r3 = r0
        L10:
            if (r3 >= r2) goto L27
            int r4 = r3 + r1
            char r4 = r8[r4]
            char[] r5 = r6.zap
            char r5 = r5[r3]
            if (r4 != r5) goto L1f
            int r3 = r3 + 1
            goto L10
        L1f:
            com.google.android.gms.common.server.response.FastParser$ParseException r6 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r7 = "Unexpected character"
            r6.<init>(r7)
            throw r6
        L27:
            int r1 = r1 + r2
            goto L2
        L29:
            com.google.android.gms.common.server.response.FastParser$ParseException r6 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r7 = "Unexpected EOF"
            r6.<init>(r7)
            throw r6
        L31:
            return
    }

    private final boolean zay(java.io.BufferedReader r5, boolean r6) {
            r4 = this;
            char r0 = r4.zai(r5)
            r1 = 34
            r2 = 1
            if (r0 == r1) goto L39
            r1 = 102(0x66, float:1.43E-43)
            r3 = 0
            if (r0 == r1) goto L2e
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L28
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto L21
            if (r6 == 0) goto L1b
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zac
            goto L1d
        L1b:
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zab
        L1d:
            r4.zax(r5, r6)
            return r2
        L21:
            java.lang.String r4 = "Unexpected token: "
            defpackage.e41.d(r0, r4)
            r4 = 0
            return r4
        L28:
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zaa
            r4.zax(r5, r6)
            return r3
        L2e:
            if (r6 == 0) goto L33
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zae
            goto L35
        L33:
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zad
        L35:
            r4.zax(r5, r6)
            return r3
        L39:
            if (r6 != 0) goto L40
            boolean r4 = r4.zay(r5, r2)
            return r4
        L40:
            com.google.android.gms.common.server.response.FastParser$ParseException r4 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r5 = "No boolean value found in string"
            r4.<init>(r5)
            throw r4
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final boolean zaz(java.io.BufferedReader r18, com.google.android.gms.common.server.response.FastJsonResponse r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "Error instantiating inner object"
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.util.Map r6 = r2.getFieldMappings()
            java.lang.String r7 = r17.zaq(r18)
            if (r7 == 0) goto L268
        L17:
            if (r7 == 0) goto L264
            java.lang.Object r7 = r6.get(r7)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r7 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r7
            if (r7 != 0) goto L26
            java.lang.String r7 = r17.zar(r18)
            goto L17
        L26:
            java.util.Stack r9 = r0.zat
            r10 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r9.push(r11)
            int r9 = r7.zaa
            r11 = 44
            r12 = 123(0x7b, float:1.72E-43)
            r13 = 125(0x7d, float:1.75E-43)
            r14 = 110(0x6e, float:1.54E-43)
            r15 = 0
            switch(r9) {
                case 0: goto L22a;
                case 1: goto L212;
                case 2: goto L1fa;
                case 3: goto L1e2;
                case 4: goto L1ca;
                case 5: goto L1b2;
                case 6: goto L196;
                case 7: goto L17e;
                case 8: goto L16a;
                case 9: goto L156;
                case 10: goto Lbe;
                case 11: goto L4a;
                default: goto L3e;
            }
        L3e:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r1 = "Invalid field type "
            java.lang.String r1 = defpackage.lb1.g(r9, r1)
            r0.<init>(r1)
            throw r0
        L4a:
            boolean r9 = r7.zab
            if (r9 == 0) goto L81
            char r9 = r17.zai(r18)
            if (r9 != r14) goto L61
            char[] r9 = com.google.android.gms.common.server.response.FastParser.zaa
            r0.zax(r1, r9)
            java.lang.String r9 = r7.zae
            r2.addConcreteTypeArrayInternal(r7, r9, r15)
        L5e:
            r7 = r10
            goto L242
        L61:
            java.util.Stack r12 = r0.zat
            r14 = 5
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12.push(r14)
            r12 = 91
            if (r9 != r12) goto L79
            java.lang.String r9 = r7.zae
            java.util.ArrayList r12 = r0.zav(r1, r7)
            r2.addConcreteTypeArrayInternal(r7, r9, r12)
            goto L5e
        L79:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r1 = "Expected array start"
            r0.<init>(r1)
            throw r0
        L81:
            char r9 = r17.zai(r18)
            if (r9 != r14) goto L92
            char[] r9 = com.google.android.gms.common.server.response.FastParser.zaa
            r0.zax(r1, r9)
            java.lang.String r9 = r7.zae
            r2.addConcreteTypeInternal(r7, r9, r15)
            goto L5e
        L92:
            java.util.Stack r14 = r0.zat
            r14.push(r5)
            if (r9 != r12) goto Lb6
            com.google.android.gms.common.server.response.FastJsonResponse r9 = r7.zad()     // Catch: java.lang.IllegalAccessException -> La6 java.lang.InstantiationException -> La8
            r0.zaz(r1, r9)     // Catch: java.lang.IllegalAccessException -> La6 java.lang.InstantiationException -> La8
            java.lang.String r12 = r7.zae     // Catch: java.lang.IllegalAccessException -> La6 java.lang.InstantiationException -> La8
            r2.addConcreteTypeInternal(r7, r12, r9)     // Catch: java.lang.IllegalAccessException -> La6 java.lang.InstantiationException -> La8
            goto L5e
        La6:
            r0 = move-exception
            goto Laa
        La8:
            r0 = move-exception
            goto Lb0
        Laa:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r3, r0)
            throw r1
        Lb0:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r3, r0)
            throw r1
        Lb6:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r1 = "Expected start of object"
            r0.<init>(r1)
            throw r0
        Lbe:
            char r9 = r17.zai(r18)
            if (r9 != r14) goto Lcd
            char[] r9 = com.google.android.gms.common.server.response.FastParser.zaa
            r0.zax(r1, r9)
            r9 = r15
        Lca:
            r16 = 0
            goto L118
        Lcd:
            if (r9 != r12) goto L14e
            java.util.Stack r9 = r0.zat
            r9.push(r5)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        Ld9:
            char r12 = r17.zai(r18)
            if (r12 == 0) goto L146
            r14 = 34
            if (r12 == r14) goto Lea
            if (r12 == r13) goto Le6
            goto Ld9
        Le6:
            r0.zaw(r4)
            goto Lca
        Lea:
            char[] r12 = r0.zap
            java.lang.StringBuilder r10 = r0.zar
            java.lang.String r10 = zaA(r1, r12, r10, r15)
            char r12 = r17.zai(r18)
            r16 = 0
            r8 = 58
            if (r12 != r8) goto L136
            char r8 = r17.zai(r18)
            if (r8 != r14) goto L126
            char[] r8 = r0.zap
            java.lang.StringBuilder r12 = r0.zar
            java.lang.String r8 = zaA(r1, r8, r12, r15)
            r9.put(r10, r8)
            char r8 = r17.zai(r18)
            if (r8 == r11) goto L124
            if (r8 != r13) goto L11e
            r0.zaw(r4)
        L118:
            r2.zaB(r7, r9)
        L11b:
            r7 = 4
            goto L242
        L11e:
            java.lang.String r0 = "Unexpected character while parsing string map: "
            defpackage.e41.d(r8, r0)
            return r16
        L124:
            r10 = 4
            goto Ld9
        L126:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected String value for key "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L136:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "No map value found for key "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L146:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r1 = "Unexpected EOF"
            r0.<init>(r1)
            throw r0
        L14e:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r1 = "Expected start of a map object"
            r0.<init>(r1)
            throw r0
        L156:
            r16 = 0
            char[] r8 = r0.zaq
            java.lang.StringBuilder r9 = r0.zas
            char[] r10 = com.google.android.gms.common.server.response.FastParser.zaf
            java.lang.String r8 = r0.zap(r1, r8, r9, r10)
            byte[] r8 = com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(r8)
            r2.zal(r7, r8)
            goto L11b
        L16a:
            r16 = 0
            char[] r8 = r0.zaq
            java.lang.StringBuilder r9 = r0.zas
            char[] r10 = com.google.android.gms.common.server.response.FastParser.zaf
            java.lang.String r8 = r0.zap(r1, r8, r9, r10)
            byte[] r8 = com.google.android.gms.common.util.Base64Utils.decode(r8)
            r2.zal(r7, r8)
            goto L11b
        L17e:
            r16 = 0
            boolean r8 = r7.zab
            if (r8 == 0) goto L18e
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zal
            java.util.ArrayList r8 = r0.zau(r1, r8)
            r2.zaC(r7, r8)
            goto L11b
        L18e:
            java.lang.String r8 = r17.zao(r18)
            r2.zaA(r7, r8)
            goto L11b
        L196:
            r16 = 0
            boolean r8 = r7.zab
            if (r8 == 0) goto L1a7
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zak
            java.util.ArrayList r8 = r0.zau(r1, r8)
            r2.zaj(r7, r8)
            goto L11b
        L1a7:
            r8 = r16
            boolean r9 = r0.zay(r1, r8)
            r2.zai(r7, r9)
            goto L11b
        L1b2:
            boolean r8 = r7.zab
            if (r8 == 0) goto L1c1
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zan
            java.util.ArrayList r8 = r0.zau(r1, r8)
            r2.zac(r7, r8)
            goto L11b
        L1c1:
            java.math.BigDecimal r8 = r17.zas(r18)
            r2.zaa(r7, r8)
            goto L11b
        L1ca:
            boolean r8 = r7.zab
            if (r8 == 0) goto L1d9
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zaj
            java.util.ArrayList r8 = r0.zau(r1, r8)
            r2.zao(r7, r8)
            goto L11b
        L1d9:
            double r8 = r17.zaj(r18)
            r2.zam(r7, r8)
            goto L11b
        L1e2:
            boolean r8 = r7.zab
            if (r8 == 0) goto L1f1
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zai
            java.util.ArrayList r8 = r0.zau(r1, r8)
            r2.zas(r7, r8)
            goto L11b
        L1f1:
            float r8 = r17.zak(r18)
            r2.zaq(r7, r8)
            goto L11b
        L1fa:
            boolean r8 = r7.zab
            if (r8 == 0) goto L209
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zah
            java.util.ArrayList r8 = r0.zau(r1, r8)
            r2.zay(r7, r8)
            goto L11b
        L209:
            long r8 = r17.zan(r18)
            r2.zax(r7, r8)
            goto L11b
        L212:
            boolean r8 = r7.zab
            if (r8 == 0) goto L221
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zam
            java.util.ArrayList r8 = r0.zau(r1, r8)
            r2.zag(r7, r8)
            goto L11b
        L221:
            java.math.BigInteger r8 = r17.zat(r18)
            r2.zae(r7, r8)
            goto L11b
        L22a:
            boolean r8 = r7.zab
            if (r8 == 0) goto L239
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zag
            java.util.ArrayList r8 = r0.zau(r1, r8)
            r2.zav(r7, r8)
            goto L11b
        L239:
            int r8 = r17.zal(r18)
            r2.zau(r7, r8)
            goto L11b
        L242:
            r0.zaw(r7)
            r7 = 2
            r0.zaw(r7)
            char r7 = r17.zai(r18)
            if (r7 == r11) goto L25c
            if (r7 != r13) goto L254
            r7 = r15
            goto L17
        L254:
            java.lang.String r0 = "Expected end of object or field separator, but found: "
            defpackage.e41.d(r7, r0)
            r16 = 0
            return r16
        L25c:
            r16 = 0
            java.lang.String r7 = r17.zaq(r18)
            goto L17
        L264:
            r0.zaw(r4)
            return r4
        L268:
            r16 = 0
            r0.zaw(r4)
            return r16
    }

    public void parse(java.io.InputStream r8, T r9) {
            r7 = this;
            java.lang.String r0 = "Failed to close reader while parsing."
            java.lang.String r1 = "FastParser"
            java.lang.String r2 = "Unexpected token: "
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            r4.<init>(r8)
            r8 = 1024(0x400, float:1.435E-42)
            r3.<init>(r4, r8)
            java.util.Stack r8 = r7.zat     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r8.push(r5)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            char r8 = r7.zai(r3)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            if (r8 == 0) goto L92
            r5 = 91
            r6 = 1
            if (r8 == r5) goto L4e
            r5 = 123(0x7b, float:1.72E-43)
            if (r8 != r5) goto L3c
            java.util.Stack r8 = r7.zat     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r8.push(r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r7.zaz(r3, r9)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            goto L7f
        L38:
            r7 = move-exception
            goto La0
        L3a:
            r7 = move-exception
            goto L9a
        L3c:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r9.append(r8)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            throw r7     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
        L4e:
            java.util.Stack r8 = r7.zat     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r8.push(r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.util.Map r8 = r9.getFieldMappings()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            if (r2 != r6) goto L8a
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.lang.Object r8 = r8.next()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            com.google.android.gms.common.server.response.FastJsonResponse$Field r8 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r8     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.util.ArrayList r2 = r7.zav(r3, r8)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.lang.String r5 = r8.zae     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r9.addConcreteTypeArrayInternal(r8, r5, r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
        L7f:
            r7.zaw(r4)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r3.close()     // Catch: java.io.IOException -> L86
            return
        L86:
            android.util.Log.w(r1, r0)
            return
        L8a:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.lang.String r8 = "Object array response class must have a single Field"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            throw r7     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
        L92:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.lang.String r8 = "No data to parse"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            throw r7     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
        L9a:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L38
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r3.close()     // Catch: java.io.IOException -> La4
            goto La7
        La4:
            android.util.Log.w(r1, r0)
        La7:
            throw r7
    }
}
