package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import i5.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {
    public static final float[][] E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public final float A;
    public final float B;
    public final int C;
    public final int D;

    /* renamed from: a  reason: collision with root package name */
    public final int f1127a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1128b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1129c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1130d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1131e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1132f;

    /* renamed from: g  reason: collision with root package name */
    public float f1133g;

    /* renamed from: h  reason: collision with root package name */
    public float f1134h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1135i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1136j;

    /* renamed from: k  reason: collision with root package name */
    public float f1137k;

    /* renamed from: l  reason: collision with root package name */
    public float f1138l;
    public boolean m = false;

    /* renamed from: n  reason: collision with root package name */
    public final float[] f1139n = new float[2];

    /* renamed from: o  reason: collision with root package name */
    public final int[] f1140o = new int[2];

    /* renamed from: p  reason: collision with root package name */
    public float f1141p;

    /* renamed from: q  reason: collision with root package name */
    public float f1142q;

    /* renamed from: r  reason: collision with root package name */
    public final MotionLayout f1143r;

    /* renamed from: s  reason: collision with root package name */
    public final float f1144s;

    /* renamed from: t  reason: collision with root package name */
    public final float f1145t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f1146u;

    /* renamed from: v  reason: collision with root package name */
    public final float f1147v;

    /* renamed from: w  reason: collision with root package name */
    public final int f1148w;

    /* renamed from: x  reason: collision with root package name */
    public final float f1149x;

    /* renamed from: y  reason: collision with root package name */
    public final float f1150y;

    /* renamed from: z  reason: collision with root package name */
    public final float f1151z;

    public c(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f1127a = 0;
        this.f1128b = 0;
        this.f1129c = 0;
        this.f1130d = -1;
        this.f1131e = -1;
        this.f1132f = -1;
        this.f1133g = 0.5f;
        this.f1134h = 0.5f;
        this.f1135i = -1;
        this.f1136j = false;
        this.f1137k = 0.0f;
        this.f1138l = 1.0f;
        this.f1144s = 4.0f;
        this.f1145t = 1.2f;
        this.f1146u = true;
        this.f1147v = 1.0f;
        this.f1148w = 0;
        this.f1149x = 10.0f;
        this.f1150y = 10.0f;
        this.f1151z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.f1143r = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.f7006o);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 16) {
                this.f1130d = obtainStyledAttributes.getResourceId(index, this.f1130d);
            } else if (index == 17) {
                int i10 = obtainStyledAttributes.getInt(index, this.f1127a);
                this.f1127a = i10;
                float[] fArr = E[i10];
                this.f1134h = fArr[0];
                this.f1133g = fArr[1];
            } else if (index == 1) {
                int i11 = obtainStyledAttributes.getInt(index, this.f1128b);
                this.f1128b = i11;
                if (i11 < 6) {
                    float[] fArr2 = F[i11];
                    this.f1137k = fArr2[0];
                    this.f1138l = fArr2[1];
                } else {
                    this.f1138l = Float.NaN;
                    this.f1137k = Float.NaN;
                    this.f1136j = true;
                }
            } else if (index == 6) {
                this.f1144s = obtainStyledAttributes.getFloat(index, this.f1144s);
            } else if (index == 5) {
                this.f1145t = obtainStyledAttributes.getFloat(index, this.f1145t);
            } else if (index == 7) {
                this.f1146u = obtainStyledAttributes.getBoolean(index, this.f1146u);
            } else if (index == 2) {
                this.f1147v = obtainStyledAttributes.getFloat(index, this.f1147v);
            } else if (index == 3) {
                this.f1149x = obtainStyledAttributes.getFloat(index, this.f1149x);
            } else if (index == 18) {
                this.f1131e = obtainStyledAttributes.getResourceId(index, this.f1131e);
            } else if (index == 9) {
                this.f1129c = obtainStyledAttributes.getInt(index, this.f1129c);
            } else if (index == 8) {
                this.f1148w = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f1132f = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f1135i = obtainStyledAttributes.getResourceId(index, this.f1135i);
            } else if (index == 12) {
                this.f1150y = obtainStyledAttributes.getFloat(index, this.f1150y);
            } else if (index == 13) {
                this.f1151z = obtainStyledAttributes.getFloat(index, this.f1151z);
            } else if (index == 14) {
                this.A = obtainStyledAttributes.getFloat(index, this.A);
            } else if (index == 15) {
                this.B = obtainStyledAttributes.getFloat(index, this.B);
            } else if (index == 11) {
                this.C = obtainStyledAttributes.getInt(index, this.C);
            } else if (index == 0) {
                this.D = obtainStyledAttributes.getInt(index, this.D);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i2 = this.f1132f;
        if (i2 == -1 || (findViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i2 = this.f1131e;
        if (i2 == -1 || (findViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z10) {
        float[][] fArr = E;
        float[][] fArr2 = F;
        if (z10) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f1127a];
        this.f1134h = fArr3[0];
        this.f1133g = fArr3[1];
        int i2 = this.f1128b;
        if (i2 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i2];
        this.f1137k = fArr4[0];
        this.f1138l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f1137k)) {
            return "rotation";
        }
        return this.f1137k + " , " + this.f1138l;
    }
}
