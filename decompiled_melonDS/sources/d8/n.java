package d8;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f3997a;

    /* renamed from: b  reason: collision with root package name */
    public m f3998b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f3999c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f4000d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4001e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f4002f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f4003g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f4004h;

    /* renamed from: i  reason: collision with root package name */
    public int f4005i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4006j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4007k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f4008l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3997a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
