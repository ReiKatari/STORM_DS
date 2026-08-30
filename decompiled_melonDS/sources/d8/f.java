package d8;

import a1.w0;
import a6.e1;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends g implements Animatable {
    public final Context L;
    public e1 R = null;
    public ArrayList X = null;
    public final c Y = new c(0, this);
    public final d B = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.Drawable$ConstantState, d8.d] */
    public f(Context context) {
        this.L = context;
    }

    @Override // d8.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.B;
        dVar.f3953a.draw(canvas);
        if (dVar.f3954b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.B.f3953a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.B.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.B.f3953a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.A != null) {
            return new e(this.A.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.B.f3953a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.B.f3953a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.B.f3953a.getOpacity();
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [a1.w0, a1.e] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.B;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray h2 = p5.b.h(resources, theme, attributeSet, a.f3950e);
                    int resourceId = h2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = p5.k.f11352a;
                        pVar.A = resources.getDrawable(resourceId, theme);
                        new o(pVar.A.getConstantState());
                        pVar.Y = false;
                        pVar.setCallback(this.Y);
                        p pVar2 = dVar.f3953a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f3953a = pVar;
                    }
                    h2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f3951f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.L;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(dVar.f3953a.B.f3998b.f3996o.get(string));
                            if (dVar.f3955c == null) {
                                dVar.f3955c = new ArrayList();
                                dVar.f3956d = new w0(0);
                            }
                            dVar.f3955c.add(loadAnimator);
                            dVar.f3956d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            a0.j.p("Context can't be null when inflating animators");
                            return;
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f3954b == null) {
            dVar.f3954b = new AnimatorSet();
        }
        dVar.f3954b.playTogether(dVar.f3955c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.B.f3953a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.B.f3954b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.B.f3953a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.B.f3953a.setBounds(rect);
        }
    }

    @Override // d8.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        return this.B.f3953a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.B.f3953a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.B.f3953a.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.B.f3953a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.B.f3953a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTint(i2);
        } else {
            this.B.f3953a.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.B.f3953a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.B.f3953a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.B.f3953a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.A;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.B;
        if (dVar.f3954b.isStarted()) {
            return;
        }
        dVar.f3954b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.A;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.B.f3954b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
