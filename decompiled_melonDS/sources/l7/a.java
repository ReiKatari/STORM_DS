package l7;

import android.graphics.Typeface;
import cc.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nc.k;
import p.w;
import p4.j;
import p4.l;
import p4.n;
import p4.o;
import pi.z;
import zb.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class a implements t.a, f, n, o, w {
    public final /* synthetic */ int A;

    public a(int i2, int i10) {
        this.A = 5;
    }

    public static final float c(float f8, float[] fArr, float[] fArr2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float abs = Math.abs(f8);
        float signum = Math.signum(f8);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i2 = -(binarySearch + 1);
        int i10 = i2 - 1;
        if (i10 >= fArr.length - 1) {
            float f15 = fArr[fArr.length - 1];
            float f16 = fArr2[fArr.length - 1];
            if (f15 == 0.0f) {
                return 0.0f;
            }
            return (f16 / f15) * f8;
        }
        if (i10 == -1) {
            float f17 = fArr[0];
            f12 = fArr2[0];
            f13 = f17;
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            float f18 = fArr[i10];
            float f19 = fArr[i2];
            f10 = fArr2[i10];
            f11 = f18;
            f12 = fArr2[i2];
            f13 = f19;
        }
        if (f11 == f13) {
            f14 = 0.0f;
        } else {
            f14 = (abs - f11) / (f13 - f11);
        }
        return (((f12 - f10) * Math.max(0.0f, Math.min(1.0f, f14))) + f10) * signum;
    }

    public static ArrayList e(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((z) obj) != z.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.G(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(((z) obj2).toString());
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fj.e, java.lang.Object] */
    public static byte[] f(List list) {
        list.getClass();
        ?? obj = new Object();
        ArrayList e6 = e(list);
        int size = e6.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = e6.get(i2);
            i2++;
            String str = (String) obj2;
            obj.e0(str.length());
            obj.k0(str);
        }
        return obj.I(obj.B);
    }

    public static Typeface g(String str, j jVar, int i2) {
        if (i2 == 0 && k.a(jVar, j.R) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int l10 = k7.w.l(jVar, i2);
        if (str != null && str.length() != 0) {
            return Typeface.create(str, l10);
        }
        return Typeface.defaultFromStyle(l10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
        if (r11 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
        if (r10 != (-1)) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h(o6.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.a.h(o6.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // p4.o
    public Typeface b(l lVar, j jVar, int i2) {
        String str;
        lVar.getClass();
        int i10 = jVar.A / 100;
        if (i10 >= 0 && i10 < 2) {
            str = "monospace-thin";
        } else if (2 <= i10 && i10 < 4) {
            str = "monospace-light";
        } else {
            if (i10 != 4) {
                if (i10 == 5) {
                    str = "monospace-medium";
                } else if ((6 > i10 || i10 >= 8) && 8 <= i10 && i10 < 11) {
                    str = "monospace-black";
                }
            }
            str = "monospace";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface g10 = g(str, jVar, i2);
            if (!k.a(g10, Typeface.create(Typeface.DEFAULT, k7.w.l(jVar, i2))) && !k.a(g10, g(null, jVar, i2))) {
                typeface = g10;
            }
        }
        if (typeface == null) {
            return g("monospace", jVar, i2);
        }
        return typeface;
    }

    @Override // p4.o
    public Typeface d(j jVar, int i2) {
        return g(null, jVar, i2);
    }

    public boolean i(CharSequence charSequence) {
        return false;
    }

    @Override // p.w
    public boolean l(p.l lVar) {
        return false;
    }

    public /* synthetic */ a(int i2) {
        this.A = i2;
    }

    @Override // t.a
    public Object apply(Object obj) {
        return obj;
    }

    @Override // p.w
    public void a(p.l lVar, boolean z10) {
    }
}
