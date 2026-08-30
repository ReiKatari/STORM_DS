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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements nx3, AbsListView.SelectionBoundsAdjuster {
    public zw3 A;
    public ImageView B;
    public RadioButton L;
    public TextView R;
    public CheckBox c0;
    public TextView d0;
    public ImageView e0;
    public ImageView f0;
    public LinearLayout g0;
    public final Drawable h0;
    public final int i0;
    public final Context j0;
    public boolean k0;
    public final Drawable l0;
    public final boolean m0;
    public LayoutInflater n0;
    public boolean o0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n85 q = n85.q(getContext(), attributeSet, by4.r, R.attr.listMenuViewStyle);
        this.h0 = q.f(5);
        TypedArray typedArray = (TypedArray) q.L;
        this.i0 = typedArray.getResourceId(1, -1);
        this.k0 = typedArray.getBoolean(7, false);
        this.j0 = context;
        this.l0 = q.f(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.m0 = obtainStyledAttributes.hasValue(0);
        q.t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.n0 == null) {
            this.n0 = LayoutInflater.from(getContext());
        }
        return this.n0;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.e0;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f0;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f0.getLayoutParams();
            rect.top = this.f0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r0 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    @Override // defpackage.nx3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.zw3 r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(zw3):void");
    }

    @Override // defpackage.nx3
    public zw3 getItemData() {
        return this.A;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.h0);
        TextView textView = (TextView) findViewById(R.id.title);
        this.R = textView;
        int i = this.i0;
        if (i != -1) {
            textView.setTextAppearance(this.j0, i);
        }
        this.d0 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.e0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.l0);
        }
        this.f0 = (ImageView) findViewById(R.id.group_divider);
        this.g0 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.B != null && this.k0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.B.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (z || this.L != null || this.c0 != null) {
            if ((this.A.x & 4) != 0) {
                if (this.L == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.L = radioButton;
                    LinearLayout linearLayout = this.g0;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.L;
                view = this.c0;
            } else {
                if (this.c0 == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.c0 = checkBox;
                    LinearLayout linearLayout2 = this.g0;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.c0;
                view = this.L;
            }
            if (z) {
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
            CheckBox checkBox2 = this.c0;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.L;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.A.x & 4) != 0) {
            if (this.L == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.L = radioButton;
                LinearLayout linearLayout = this.g0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.L;
        } else {
            if (this.c0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.c0 = checkBox;
                LinearLayout linearLayout2 = this.g0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.c0;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.o0 = z;
        this.k0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f0;
        if (imageView != null) {
            if (!this.m0 && z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        uw3 uw3Var = this.A.n;
        boolean z = this.o0;
        if (z || this.k0) {
            ImageView imageView = this.B;
            if (imageView != null || drawable != null || this.k0) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.B = imageView2;
                    LinearLayout linearLayout = this.g0;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable == null && !this.k0) {
                    this.B.setVisibility(8);
                    return;
                }
                ImageView imageView3 = this.B;
                if (!z) {
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
