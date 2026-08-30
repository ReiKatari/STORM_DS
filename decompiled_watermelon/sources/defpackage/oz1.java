package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oz1  reason: default package */
/* loaded from: classes.dex */
public final class oz1 implements nz1 {
    public final String b;
    public final ox4 c;
    public final boolean d;
    public final int e;
    public final LinkedHashMap f;

    public oz1(String str, ox4 ox4Var) {
        boolean z;
        int i;
        ox4Var.getClass();
        this.b = str;
        this.c = ox4Var;
        this.f = new LinkedHashMap();
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            ve2.c0("EncoderProfilesProviderAdapter", "Camera id is not an integer:  " + this.b + ", unable to create EncoderProfilesProviderAdapter.");
            z = false;
            i = -1;
        }
        this.d = z;
        this.e = i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:10|(6:12|(2:45|(1:47)(6:48|49|(1:51)(1:(1:53)(2:54|55))|(4:16|(2:40|(2:42|(3:20|(1:(2:23|(2:24|(2:26|(2:28|29))(1:30))))(2:32|(1:(2:34|(2:37|38)(1:36))(1:39)))|31)))|18|(0))|43|44))|14|(0)|43|44)|59|60|(14:62|(1:64)|65|66|68|69|(2:71|(1:(1:74)(1:75)))(1:89)|76|77|79|80|(0)|43|44)|14|(0)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        defpackage.ve2.d0("EncoderProfilesProviderAdapter", "Unable to get CamcorderProfile by quality: " + r22, r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    @Override // defpackage.nz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zw a(int r22) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oz1.a(int):zw");
    }

    @Override // defpackage.nz1
    public final boolean b(int i) {
        if (!this.d || a(i) == null) {
            return false;
        }
        return true;
    }
}
