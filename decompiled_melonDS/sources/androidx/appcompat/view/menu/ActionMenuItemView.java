package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import k.a;
import p.b;
import p.c;
import p.l;
import p.n;
import p.y;
import p7.t;
import q.k;
import q.z0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends z0 implements y, View.OnClickListener, k {

    /* renamed from: e0  reason: collision with root package name */
    public n f880e0;

    /* renamed from: f0  reason: collision with root package name */
    public CharSequence f881f0;

    /* renamed from: g0  reason: collision with root package name */
    public Drawable f882g0;

    /* renamed from: h0  reason: collision with root package name */
    public p.k f883h0;

    /* renamed from: i0  reason: collision with root package name */
    public b f884i0;

    /* renamed from: j0  reason: collision with root package name */
    public c f885j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f886k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f887l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f888m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f889n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f890o0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f886k0 = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f7913c, 0, 0);
        this.f888m0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f890o0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f889n0 = -1;
        setSaveEnabled(false);
    }

    @Override // q.k
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.y
    public final void b(n nVar) {
        int i2;
        this.f880e0 = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f11133a);
        if (nVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f884i0 == null) {
            this.f884i0 = new b(this);
        }
    }

    @Override // q.k
    public final boolean c() {
        if (!TextUtils.isEmpty(getText()) && this.f880e0.getIcon() == null) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i2 < 480) {
            if ((i2 < 640 || i10 < 480) && configuration.orientation != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p.y
    public n getItemData() {
        return this.f880e0;
    }

    public final void h() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f881f0);
        if (this.f882g0 != null && ((this.f880e0.f11156y & 4) != 4 || (!this.f886k0 && !this.f887l0))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence3 = null;
        if (z12) {
            charSequence = this.f881f0;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f880e0.f11148q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z12) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f880e0.f11137e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f880e0.f11149r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z12) {
                charSequence3 = this.f880e0.f11137e;
            }
            t.E(this, charSequence3);
            return;
        }
        t.E(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p.k kVar = this.f883h0;
        if (kVar != null) {
            kVar.c(this.f880e0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f886k0 = g();
        h();
    }

    @Override // q.z0, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i10) {
        int i11;
        int i12;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i12 = this.f889n0) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i10);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f888m0;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(size, i13);
        } else {
            i11 = i13;
        }
        if (mode != 1073741824 && i13 > 0 && measuredWidth < i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
        }
        if (isEmpty && this.f882g0 != null) {
            super.setPadding((getMeasuredWidth() - this.f882g0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f880e0.hasSubMenu() && (bVar = this.f884i0) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f887l0 != z10) {
            this.f887l0 = z10;
            n nVar = this.f880e0;
            if (nVar != null) {
                l lVar = nVar.f11145n;
                lVar.f11120k = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f882g0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f890o0;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(p.k kVar) {
        this.f883h0 = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i10, int i11, int i12) {
        this.f889n0 = i2;
        super.setPadding(i2, i10, i11, i12);
    }

    public void setPopupCallback(c cVar) {
        this.f885j0 = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f881f0 = charSequence;
        h();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
