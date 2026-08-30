package defpackage;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gu2  reason: default package */
/* loaded from: classes.dex */
public final class gu2 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public gu2(int i) {
        this.a = i;
        switch (i) {
            case 1:
                return;
            default:
                this.d = "";
                this.e = "";
                this.b = -1;
                this.h = l07.f0("");
                return;
        }
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int y0 = zg6.y0('&', i, 4, str);
            if (y0 == -1) {
                y0 = str.length();
            }
            int y02 = zg6.y0('=', i, 4, str);
            if (y02 != -1 && y02 <= y0) {
                arrayList.add(str.substring(i, y02));
                arrayList.add(str.substring(y02 + 1, y0));
            } else {
                arrayList.add(str.substring(i, y0));
                arrayList.add(null);
            }
            i = y0 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [a36[], java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, int[][], java.io.Serializable] */
    public void a(int[] iArr, a36 a36Var) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.c = a36Var;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.d = r3;
            ?? r1 = new a36[i2];
            System.arraycopy((a36[]) this.e, 0, r1, 0, i);
            this.e = r1;
        }
        int i3 = this.b;
        ((int[][]) this.d)[i3] = iArr;
        ((a36[]) this.e)[i3] = a36Var;
        this.b = i3 + 1;
    }

    public hu2 b() {
        ArrayList arrayList;
        String str;
        String str2 = (String) this.c;
        String str3 = null;
        if (str2 != null) {
            String C = dk7.C((String) this.d, 0, 0, 7);
            String C2 = dk7.C((String) this.e, 0, 0, 7);
            String str4 = (String) this.f;
            if (str4 != null) {
                int c = c();
                ArrayList arrayList2 = (ArrayList) this.h;
                ArrayList arrayList3 = new ArrayList(uq0.y0(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList3.add(dk7.C((String) obj, 0, 0, 7));
                }
                ArrayList arrayList4 = (ArrayList) this.i;
                if (arrayList4 != null) {
                    ArrayList arrayList5 = new ArrayList(uq0.y0(arrayList4, 10));
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList4.get(i2);
                        i2++;
                        String str5 = (String) obj2;
                        if (str5 != null) {
                            str = dk7.C(str5, 0, 0, 3);
                        } else {
                            str = null;
                        }
                        arrayList5.add(str);
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                String str6 = (String) this.g;
                if (str6 != null) {
                    str3 = dk7.C(str6, 0, 0, 7);
                }
                return new hu2(str2, C, C2, str4, c, arrayList3, arrayList, str3, toString());
            }
            i.n("host == null");
            return null;
        }
        i.n("scheme == null");
        return null;
    }

    public int c() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.c;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        if (!str.equals("https")) {
            return -1;
        }
        return 443;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a36[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void d() {
        this.c = new a36();
        this.d = new int[10];
        this.e = new a36[10];
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
    public void e(defpackage.hu2 r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu2.e(hu2, java.lang.String):void");
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu2.toString():java.lang.String");
    }

    public gu2(a36 a36Var) {
        this.a = 1;
        d();
        a(StateSet.WILD_CARD, a36Var);
    }
}
