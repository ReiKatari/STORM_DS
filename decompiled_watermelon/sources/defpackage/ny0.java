package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ny0  reason: default package */
/* loaded from: classes.dex */
public final class ny0 {
    public int a;
    public int b;
    public Object c;
    public Cloneable d;
    public Cloneable e;

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Cloneable, int[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Cloneable, int[]] */
    public int a(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            ?? r2 = new int[i2];
            nu.e0(jArr, jArr2, 0, 0, jArr.length);
            nu.h0(0, 0, 14, (int[]) this.d, r2);
            this.c = jArr2;
            this.d = r2;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int length2 = ((int[]) this.e).length;
        if (this.b >= length2) {
            int i4 = length2 * 2;
            ?? r22 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                r22[i5] = i6;
                i5 = i6;
            }
            nu.h0(0, 0, 14, (int[]) this.e, r22);
            this.e = r22;
        }
        int i7 = this.b;
        int[] iArr = (int[]) this.e;
        this.b = iArr[i7];
        long[] jArr3 = (long[]) this.c;
        jArr3[i3] = j;
        ((int[]) this.d)[i3] = i7;
        iArr[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (b53.F(jArr3[i8], j) <= 0) {
                break;
            }
            c(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public void b(Context context, XmlResourceParser xmlResourceParser) {
        int i;
        uy0 uy0Var = new uy0();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlResourceParser.getAttributeName(i2);
            String attributeValue = xmlResourceParser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                uy0Var.k(context, xmlResourceParser);
                ((SparseArray) this.e).put(i, uy0Var);
                return;
            }
        }
    }

    public void c(int i, int i2) {
        long[] jArr = (long[]) this.c;
        int[] iArr = (int[]) this.d;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
