package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ie6  reason: default package */
/* loaded from: classes.dex */
public final class ie6 {
    public static final int[] i = new int[3];
    public static final float[] j = {RecyclerView.B1, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {RecyclerView.B1, RecyclerView.B1, 0.5f, 1.0f};
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final int d;
    public final int e;
    public final int f;
    public final Path g = new Path();
    public final Paint h;

    public ie6() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.a = paint2;
        this.d = tt0.d(-16777216, 68);
        this.e = tt0.d(-16777216, 20);
        this.f = tt0.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint3);
    }
}
