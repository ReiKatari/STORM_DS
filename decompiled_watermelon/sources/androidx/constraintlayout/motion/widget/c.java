package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class c {
    public static final float[][] E = {new float[]{0.5f, RecyclerView.A1}, new float[]{RecyclerView.A1, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{RecyclerView.A1, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] F = {new float[]{RecyclerView.A1, -1.0f}, new float[]{RecyclerView.A1, 1.0f}, new float[]{-1.0f, RecyclerView.A1}, new float[]{1.0f, RecyclerView.A1}, new float[]{-1.0f, RecyclerView.A1}, new float[]{1.0f, RecyclerView.A1}};
    public final float A;
    public final float B;
    public final int C;
    public final int D;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public float g;
    public float h;
    public final int i;
    public final boolean j;
    public float k;
    public float l;
    public boolean m = false;
    public final float[] n = new float[2];
    public final int[] o = new int[2];
    public float p;
    public float q;
    public final MotionLayout r;
    public final float s;
    public final float t;
    public final boolean u;
    public final float v;
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    public c(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0.5f;
        this.h = 0.5f;
        this.i = -1;
        this.j = false;
        this.k = RecyclerView.A1;
        this.l = 1.0f;
        this.s = 4.0f;
        this.t = 1.2f;
        this.u = true;
        this.v = 1.0f;
        this.w = 0;
        this.x = 10.0f;
        this.y = 10.0f;
        this.z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.r = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), tx4.o);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 16) {
                this.d = obtainStyledAttributes.getResourceId(index, this.d);
            } else if (index == 17) {
                int i2 = obtainStyledAttributes.getInt(index, this.a);
                this.a = i2;
                float[] fArr = E[i2];
                this.h = fArr[0];
                this.g = fArr[1];
            } else if (index == 1) {
                int i3 = obtainStyledAttributes.getInt(index, this.b);
                this.b = i3;
                if (i3 < 6) {
                    float[] fArr2 = F[i3];
                    this.k = fArr2[0];
                    this.l = fArr2[1];
                } else {
                    this.l = Float.NaN;
                    this.k = Float.NaN;
                    this.j = true;
                }
            } else if (index == 6) {
                this.s = obtainStyledAttributes.getFloat(index, this.s);
            } else if (index == 5) {
                this.t = obtainStyledAttributes.getFloat(index, this.t);
            } else if (index == 7) {
                this.u = obtainStyledAttributes.getBoolean(index, this.u);
            } else if (index == 2) {
                this.v = obtainStyledAttributes.getFloat(index, this.v);
            } else if (index == 3) {
                this.x = obtainStyledAttributes.getFloat(index, this.x);
            } else if (index == 18) {
                this.e = obtainStyledAttributes.getResourceId(index, this.e);
            } else if (index == 9) {
                this.c = obtainStyledAttributes.getInt(index, this.c);
            } else if (index == 8) {
                this.w = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.i = obtainStyledAttributes.getResourceId(index, this.i);
            } else if (index == 12) {
                this.y = obtainStyledAttributes.getFloat(index, this.y);
            } else if (index == 13) {
                this.z = obtainStyledAttributes.getFloat(index, this.z);
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
        int i = this.f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z) {
        float[][] fArr = E;
        float[][] fArr2 = F;
        if (z) {
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
        float[] fArr3 = fArr[this.a];
        this.h = fArr3[0];
        this.g = fArr3[1];
        int i = this.b;
        if (i >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i];
        this.k = fArr4[0];
        this.l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.k)) {
            return "rotation";
        }
        return this.k + " , " + this.l;
    }
}
