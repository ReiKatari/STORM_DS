package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk7  reason: default package */
/* loaded from: classes.dex */
public abstract class kk7 {
    public static final /* synthetic */ int a = 0;

    static {
            java.lang.String r0 = "^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$"
            r1 = 2
            java.util.regex.Pattern.compile(r0, r1)
            java.lang.String r0 = "^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$"
            java.util.regex.Pattern.compile(r0, r1)
            return
    }

    public static void a(int r2) {
            r0 = 16
            if (r2 == r0) goto L1f
            r0 = 32
            if (r2 != r0) goto L9
            goto L1f
        L9:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            int r2 = r2 * 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = "invalid key size %d; only 128-bit and 256-bit AES keys are supported"
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
        L1f:
            return
    }

    public static java.lang.String b(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r2.toLowerCase(r0)
            java.lang.String r1 = "android-keystore://"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L15
            r0 = 19
            java.lang.String r2 = r2.substring(r0)
            return r2
        L15:
            java.lang.String r2 = "key URI must start with android-keystore://"
            defpackage.i.h(r2)
            r2 = 0
            return r2
    }
}
