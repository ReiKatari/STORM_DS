package i5;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f6885a;

    /* renamed from: b  reason: collision with root package name */
    public int f6886b;

    /* renamed from: c  reason: collision with root package name */
    public Object f6887c;

    /* renamed from: d  reason: collision with root package name */
    public Cloneable f6888d;

    /* renamed from: e  reason: collision with root package name */
    public Cloneable f6889e;

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.lang.Cloneable] */
    public int a(long j2) {
        int i2 = this.f6885a + 1;
        long[] jArr = (long[]) this.f6887c;
        int length = jArr.length;
        if (i2 > length) {
            int i10 = length * 2;
            long[] jArr2 = new long[i10];
            ?? r22 = new int[i10];
            zb.k.h(jArr, jArr2, 0, 0, jArr.length);
            zb.k.j(0, 0, 14, (int[]) this.f6888d, r22);
            this.f6887c = jArr2;
            this.f6888d = r22;
        }
        int i11 = this.f6885a;
        this.f6885a = i11 + 1;
        int length2 = ((int[]) this.f6889e).length;
        if (this.f6886b >= length2) {
            int i12 = length2 * 2;
            ?? r23 = new int[i12];
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i13 + 1;
                r23[i13] = i14;
                i13 = i14;
            }
            zb.k.j(0, 0, 14, (int[]) this.f6889e, r23);
            this.f6889e = r23;
        }
        int i15 = this.f6886b;
        int[] iArr = (int[]) this.f6889e;
        this.f6886b = iArr[i15];
        long[] jArr3 = (long[]) this.f6887c;
        jArr3[i11] = j2;
        ((int[]) this.f6888d)[i11] = i15;
        iArr[i15] = i11;
        while (i11 > 0) {
            int i16 = ((i11 + 1) >> 1) - 1;
            if (nc.k.c(jArr3[i16], j2) <= 0) {
                break;
            }
            c(i16, i11);
            i11 = i16;
        }
        return i15;
    }

    public void b(Context context, XmlResourceParser xmlResourceParser) {
        int i2;
        q qVar = new q();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                if (attributeValue.contains("/")) {
                    i2 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i2 = -1;
                }
                if (i2 == -1) {
                    if (attributeValue.length() > 1) {
                        i2 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                qVar.k(context, xmlResourceParser);
                ((SparseArray) this.f6889e).put(i2, qVar);
                return;
            }
        }
    }

    public void c(int i2, int i10) {
        long[] jArr = (long[]) this.f6887c;
        int[] iArr = (int[]) this.f6888d;
        int[] iArr2 = (int[]) this.f6889e;
        long j2 = jArr[i2];
        jArr[i2] = jArr[i10];
        jArr[i10] = j2;
        int i11 = iArr[i2];
        int i12 = iArr[i10];
        iArr[i2] = i12;
        iArr[i10] = i11;
        iArr2[i12] = i2;
        iArr2[i11] = i10;
    }
}
