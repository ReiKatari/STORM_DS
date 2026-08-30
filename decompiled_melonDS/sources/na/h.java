package na;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class h extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public n f10144a;

    /* renamed from: b  reason: collision with root package name */
    public b0 f10145b;

    /* renamed from: c  reason: collision with root package name */
    public ga.a f10146c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f10147d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f10148e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f10149f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f10150g;

    /* renamed from: h  reason: collision with root package name */
    public Rect f10151h;

    /* renamed from: i  reason: collision with root package name */
    public final float f10152i;

    /* renamed from: j  reason: collision with root package name */
    public float f10153j;

    /* renamed from: k  reason: collision with root package name */
    public float f10154k;

    /* renamed from: l  reason: collision with root package name */
    public int f10155l;
    public float m;

    /* renamed from: n  reason: collision with root package name */
    public float f10156n;

    /* renamed from: o  reason: collision with root package name */
    public int f10157o;

    /* renamed from: p  reason: collision with root package name */
    public int f10158p;

    /* renamed from: q  reason: collision with root package name */
    public final Paint.Style f10159q;

    public h(h hVar) {
        this.f10147d = null;
        this.f10148e = null;
        this.f10149f = null;
        this.f10150g = PorterDuff.Mode.SRC_IN;
        this.f10151h = null;
        this.f10152i = 1.0f;
        this.f10153j = 1.0f;
        this.f10155l = 255;
        this.m = 0.0f;
        this.f10156n = 0.0f;
        this.f10157o = 0;
        this.f10158p = 0;
        this.f10159q = Paint.Style.FILL_AND_STROKE;
        this.f10144a = hVar.f10144a;
        this.f10145b = hVar.f10145b;
        this.f10146c = hVar.f10146c;
        this.f10154k = hVar.f10154k;
        this.f10147d = hVar.f10147d;
        this.f10148e = hVar.f10148e;
        this.f10150g = hVar.f10150g;
        this.f10149f = hVar.f10149f;
        this.f10155l = hVar.f10155l;
        this.f10152i = hVar.f10152i;
        this.f10158p = hVar.f10158p;
        this.f10153j = hVar.f10153j;
        this.m = hVar.m;
        this.f10156n = hVar.f10156n;
        this.f10157o = hVar.f10157o;
        this.f10159q = hVar.f10159q;
        if (hVar.f10151h != null) {
            this.f10151h = new Rect(hVar.f10151h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        j jVar = new j(this);
        jVar.Y = true;
        jVar.Z = true;
        return jVar;
    }

    public h(n nVar) {
        this.f10147d = null;
        this.f10148e = null;
        this.f10149f = null;
        this.f10150g = PorterDuff.Mode.SRC_IN;
        this.f10151h = null;
        this.f10152i = 1.0f;
        this.f10153j = 1.0f;
        this.f10155l = 255;
        this.m = 0.0f;
        this.f10156n = 0.0f;
        this.f10157o = 0;
        this.f10158p = 0;
        this.f10159q = Paint.Style.FILL_AND_STROKE;
        this.f10144a = nVar;
        this.f10146c = null;
    }
}
