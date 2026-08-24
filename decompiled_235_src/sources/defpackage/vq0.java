package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vq0  reason: default package */
/* loaded from: classes.dex */
public final class vq0 {
    public final RectF a = new RectF();
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int[] i;
    public int j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public Path o;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;

    public vq0() {
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        this.e = RecyclerView.B1;
        this.f = RecyclerView.B1;
        this.g = RecyclerView.B1;
        this.h = 5.0f;
        this.p = 1.0f;
        this.t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i) {
        this.j = i;
        this.u = this.i[i];
    }
}
