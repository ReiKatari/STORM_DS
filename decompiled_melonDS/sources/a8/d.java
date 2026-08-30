package a8;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f642a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f643b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f644c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f645d;

    /* renamed from: e  reason: collision with root package name */
    public float f646e;

    /* renamed from: f  reason: collision with root package name */
    public float f647f;

    /* renamed from: g  reason: collision with root package name */
    public float f648g;

    /* renamed from: h  reason: collision with root package name */
    public float f649h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f650i;

    /* renamed from: j  reason: collision with root package name */
    public int f651j;

    /* renamed from: k  reason: collision with root package name */
    public float f652k;

    /* renamed from: l  reason: collision with root package name */
    public float f653l;
    public float m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f654n;

    /* renamed from: o  reason: collision with root package name */
    public Path f655o;

    /* renamed from: p  reason: collision with root package name */
    public float f656p;

    /* renamed from: q  reason: collision with root package name */
    public float f657q;

    /* renamed from: r  reason: collision with root package name */
    public int f658r;

    /* renamed from: s  reason: collision with root package name */
    public int f659s;

    /* renamed from: t  reason: collision with root package name */
    public int f660t;

    /* renamed from: u  reason: collision with root package name */
    public int f661u;

    public d() {
        Paint paint = new Paint();
        this.f643b = paint;
        Paint paint2 = new Paint();
        this.f644c = paint2;
        Paint paint3 = new Paint();
        this.f645d = paint3;
        this.f646e = 0.0f;
        this.f647f = 0.0f;
        this.f648g = 0.0f;
        this.f649h = 5.0f;
        this.f656p = 1.0f;
        this.f660t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i2) {
        this.f651j = i2;
        this.f661u = this.f650i[i2];
    }
}
