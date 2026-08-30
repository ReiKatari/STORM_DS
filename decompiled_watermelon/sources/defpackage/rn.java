package defpackage;

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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rn  reason: default package */
/* loaded from: classes.dex */
public final class rn extends t67 implements Animatable {
    public final Context L;
    public r7 R = null;
    public ArrayList X = null;
    public final on Y = new on(0, this);
    public final pn B = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.Drawable$ConstantState, pn] */
    public rn(Context context) {
        this.L = context;
    }

    @Override // defpackage.t67, android.graphics.drawable.Drawable
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
        pn pnVar = this.B;
        pnVar.a.draw(canvas);
        if (pnVar.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.B.a.getAlpha();
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
        return this.B.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.A != null) {
            return new qn(this.A.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.B.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.B.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.B.a.getOpacity();
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [eu, m66] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        pn pnVar;
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            pnVar = this.B;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray b0 = gk2.b0(resources, theme, attributeSet, w81.e);
                    int resourceId = b0.getResourceId(0, 0);
                    if (resourceId != 0) {
                        c77 c77Var = new c77();
                        ThreadLocal threadLocal = ac5.a;
                        c77Var.A = resources.getDrawable(resourceId, theme);
                        new b77(c77Var.A.getConstantState());
                        c77Var.Y = false;
                        c77Var.setCallback(this.Y);
                        c77 c77Var2 = pnVar.a;
                        if (c77Var2 != null) {
                            c77Var2.setCallback(null);
                        }
                        pnVar.a = c77Var;
                    }
                    b0.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, w81.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.L;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(pnVar.a.B.b.o.get(string));
                            if (pnVar.c == null) {
                                pnVar.c = new ArrayList();
                                pnVar.d = new m66(0);
                            }
                            pnVar.c.add(loadAnimator);
                            pnVar.d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            i.n("Context can't be null when inflating animators");
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
        if (pnVar.b == null) {
            pnVar.b = new AnimatorSet();
        }
        pnVar.b.playTogether(pnVar.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.B.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.B.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.B.a.isStateful();
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
            this.B.a.setBounds(rect);
        }
    }

    @Override // defpackage.t67, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.B.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.B.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.B.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.B.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.B.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.B.a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.B.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.B.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.B.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.A;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        pn pnVar = this.B;
        if (pnVar.b.isStarted()) {
            return;
        }
        pnVar.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.A;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.B.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
