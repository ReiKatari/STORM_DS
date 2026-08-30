package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w26  reason: default package */
/* loaded from: classes.dex */
public final class w26 {
    public static final int[] i = new int[3];
    public static final float[] j = {RecyclerView.A1, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {RecyclerView.A1, RecyclerView.A1, 0.5f, 1.0f};
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final int d;
    public final int e;
    public final int f;
    public final Path g = new Path();
    public final Paint h;

    public w26() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.a = paint2;
        this.d = gr0.d(-16777216, 68);
        this.e = gr0.d(-16777216, 20);
        this.f = gr0.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint3);
    }
}
