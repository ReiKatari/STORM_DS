package na;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10117a;

    /* renamed from: b  reason: collision with root package name */
    public int f10118b;

    /* renamed from: c  reason: collision with root package name */
    public Object f10119c;

    /* renamed from: d  reason: collision with root package name */
    public Serializable f10120d;

    /* renamed from: e  reason: collision with root package name */
    public Serializable f10121e;

    /* renamed from: f  reason: collision with root package name */
    public Object f10122f;

    /* renamed from: g  reason: collision with root package name */
    public Object f10123g;

    /* renamed from: h  reason: collision with root package name */
    public Object f10124h;

    /* renamed from: i  reason: collision with root package name */
    public Object f10125i;

    public a0(int i2) {
        this.f10117a = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f10120d = "";
                this.f10121e = "";
                this.f10118b = -1;
                this.f10123g = p7.t.A("");
                return;
            default:
                return;
        }
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int g02 = vc.h.g0('&', i2, 4, str);
            if (g02 == -1) {
                g02 = str.length();
            }
            int g03 = vc.h.g0('=', i2, 4, str);
            if (g03 != -1 && g03 <= g02) {
                arrayList.add(str.substring(i2, g03));
                arrayList.add(str.substring(g03 + 1, g02));
            } else {
                arrayList.add(str.substring(i2, g02));
                arrayList.add(null);
            }
            i2 = g02 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [na.n[], java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.lang.Object, java.io.Serializable] */
    public void a(int[] iArr, n nVar) {
        int i2 = this.f10118b;
        if (i2 == 0 || iArr.length == 0) {
            this.f10119c = nVar;
        }
        int[][] iArr2 = (int[][]) this.f10120d;
        if (i2 >= iArr2.length) {
            int i10 = i2 + 10;
            ?? r32 = new int[i10];
            System.arraycopy(iArr2, 0, r32, 0, i2);
            this.f10120d = r32;
            ?? r12 = new n[i10];
            System.arraycopy((n[]) this.f10121e, 0, r12, 0, i2);
            this.f10121e = r12;
        }
        int i11 = this.f10118b;
        ((int[][]) this.f10120d)[i11] = iArr;
        ((n[]) this.f10121e)[i11] = nVar;
        this.f10118b = i11 + 1;
    }

    public pi.r b() {
        ArrayList arrayList;
        String str;
        String str2 = (String) this.f10119c;
        if (str2 != null) {
            String d4 = ej.a.d((String) this.f10120d, 0, 0, 7);
            String d10 = ej.a.d((String) this.f10121e, 0, 0, 7);
            String str3 = (String) this.f10122f;
            if (str3 != null) {
                int c4 = c();
                ArrayList arrayList2 = (ArrayList) this.f10123g;
                ArrayList arrayList3 = new ArrayList(zb.m.G(arrayList2, 10));
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    arrayList3.add(ej.a.d((String) obj, 0, 0, 7));
                }
                ArrayList arrayList4 = (ArrayList) this.f10124h;
                String str4 = null;
                if (arrayList4 != null) {
                    ArrayList arrayList5 = new ArrayList(zb.m.G(arrayList4, 10));
                    int size2 = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList4.get(i10);
                        i10++;
                        String str5 = (String) obj2;
                        if (str5 != null) {
                            str = ej.a.d(str5, 0, 0, 3);
                        } else {
                            str = null;
                        }
                        arrayList5.add(str);
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                String str6 = (String) this.f10125i;
                if (str6 != null) {
                    str4 = ej.a.d(str6, 0, 0, 7);
                }
                return new pi.r(str2, d4, d10, str3, c4, arrayList3, arrayList, str4, toString());
            }
            a0.j.p("host == null");
            return null;
        }
        a0.j.p("scheme == null");
        return null;
    }

    public int c() {
        int i2 = this.f10118b;
        if (i2 != -1) {
            return i2;
        }
        String str = (String) this.f10119c;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        if (!str.equals("https")) {
            return -1;
        }
        return 443;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [na.n[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void d() {
        this.f10119c = new n();
        this.f10120d = new int[10];
        this.f10121e = new n[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0204, code lost:
        if (r8 < 65536) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r14 == ':') goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(pi.r r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: na.a0.e(pi.r, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r1 != r3) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: na.a0.toString():java.lang.String");
    }

    public a0(n nVar) {
        this.f10117a = 0;
        d();
        a(StateSet.WILD_CARD, nVar);
    }
}
