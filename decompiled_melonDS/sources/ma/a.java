package ma;

import android.graphics.Paint;
import android.graphics.Path;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f9452i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f9453j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f9454k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f9455l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f9456a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f9457b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f9458c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9459d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9460e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9461f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f9462g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f9463h;

    public a() {
        Paint paint = new Paint();
        this.f9463h = paint;
        Paint paint2 = new Paint();
        this.f9456a = paint2;
        this.f9459d = q5.a.d(-16777216, 68);
        this.f9460e = q5.a.d(-16777216, 20);
        this.f9461f = q5.a.d(-16777216, 0);
        paint2.setColor(this.f9459d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f9457b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f9458c = new Paint(paint3);
    }
}
