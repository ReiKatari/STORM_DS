package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import k.a;
import me.magnum.melonds.R;
import p.l;
import p.n;
import p.y;
import p1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {
    public n A;
    public ImageView B;
    public RadioButton L;
    public TextView R;

    /* renamed from: b0  reason: collision with root package name */
    public CheckBox f891b0;

    /* renamed from: c0  reason: collision with root package name */
    public TextView f892c0;

    /* renamed from: d0  reason: collision with root package name */
    public ImageView f893d0;

    /* renamed from: e0  reason: collision with root package name */
    public ImageView f894e0;

    /* renamed from: f0  reason: collision with root package name */
    public LinearLayout f895f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Drawable f896g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f897h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Context f898i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f899j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Drawable f900k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f901l0;

    /* renamed from: m0  reason: collision with root package name */
    public LayoutInflater f902m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f903n0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c1 o5 = c1.o(getContext(), attributeSet, a.f7927r, R.attr.listMenuViewStyle);
        this.f896g0 = o5.h(5);
        TypedArray typedArray = (TypedArray) o5.B;
        this.f897h0 = typedArray.getResourceId(1, -1);
        this.f899j0 = typedArray.getBoolean(7, false);
        this.f898i0 = context;
        this.f900k0 = o5.h(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f901l0 = obtainStyledAttributes.hasValue(0);
        o5.p();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f902m0 == null) {
            this.f902m0 = LayoutInflater.from(getContext());
        }
        return this.f902m0;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        int i2;
        ImageView imageView = this.f893d0;
        if (imageView != null) {
            if (z10) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f894e0;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f894e0.getLayoutParams();
            rect.top = this.f894e0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    @Override // p.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(p.n r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(p.n):void");
    }

    @Override // p.y
    public n getItemData() {
        return this.A;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f896g0);
        TextView textView = (TextView) findViewById(R.id.title);
        this.R = textView;
        int i2 = this.f897h0;
        if (i2 != -1) {
            textView.setTextAppearance(this.f898i0, i2);
        }
        this.f892c0 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f893d0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f900k0);
        }
        this.f894e0 = (ImageView) findViewById(R.id.group_divider);
        this.f895f0 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i10) {
        if (this.B != null && this.f899j0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.B.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i2, i10);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (z10 || this.L != null || this.f891b0 != null) {
            if ((this.A.f11155x & 4) != 0) {
                if (this.L == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.L = radioButton;
                    LinearLayout linearLayout = this.f895f0;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.L;
                view = this.f891b0;
            } else {
                if (this.f891b0 == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.f891b0 = checkBox;
                    LinearLayout linearLayout2 = this.f895f0;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f891b0;
                view = this.L;
            }
            if (z10) {
                compoundButton.setChecked(this.A.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f891b0;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.L;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.A.f11155x & 4) != 0) {
            if (this.L == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.L = radioButton;
                LinearLayout linearLayout = this.f895f0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.L;
        } else {
            if (this.f891b0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f891b0 = checkBox;
                LinearLayout linearLayout2 = this.f895f0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f891b0;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f903n0 = z10;
        this.f899j0 = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        int i2;
        ImageView imageView = this.f894e0;
        if (imageView != null) {
            if (!this.f901l0 && z10) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
    }

    public void setIcon(Drawable drawable) {
        l lVar = this.A.f11145n;
        boolean z10 = this.f903n0;
        if (z10 || this.f899j0) {
            ImageView imageView = this.B;
            if (imageView != null || drawable != null || this.f899j0) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.B = imageView2;
                    LinearLayout linearLayout = this.f895f0;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable == null && !this.f899j0) {
                    this.B.setVisibility(8);
                    return;
                }
                ImageView imageView3 = this.B;
                if (!z10) {
                    drawable = null;
                }
                imageView3.setImageDrawable(drawable);
                if (this.B.getVisibility() != 0) {
                    this.B.setVisibility(0);
                }
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.R;
        if (charSequence != null) {
            textView.setText(charSequence);
            if (this.R.getVisibility() != 0) {
                this.R.setVisibility(0);
            }
        } else if (textView.getVisibility() != 8) {
            this.R.setVisibility(8);
        }
    }
}
