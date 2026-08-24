package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements c54, AbsListView.SelectionBoundsAdjuster {
    public o44 A;
    public ImageView B;
    public RadioButton L;
    public TextView R;
    public CheckBox d0;
    public TextView e0;
    public ImageView f0;
    public ImageView g0;
    public LinearLayout h0;
    public final Drawable i0;
    public final int j0;
    public final Context k0;
    public boolean l0;
    public final Drawable m0;
    public final boolean n0;
    public LayoutInflater o0;
    public boolean p0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m44 A = m44.A(getContext(), attributeSet, m75.r, R.attr.listMenuViewStyle);
        this.i0 = A.k(5);
        TypedArray typedArray = (TypedArray) A.L;
        this.j0 = typedArray.getResourceId(1, -1);
        this.l0 = typedArray.getBoolean(7, false);
        this.k0 = context;
        this.m0 = A.k(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.n0 = obtainStyledAttributes.hasValue(0);
        A.D();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.o0 == null) {
            this.o0 = LayoutInflater.from(getContext());
        }
        return this.o0;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.f0;
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
        ImageView imageView = this.g0;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.g0.getLayoutParams();
            rect.top = this.g0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r0 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    @Override // defpackage.c54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(o44 o44Var) {
        int i;
        boolean z;
        char c;
        int i2;
        String sb;
        char c2;
        char c3;
        this.A = o44Var;
        boolean isVisible = o44Var.isVisible();
        i44 i44Var = o44Var.n;
        int i3 = 0;
        if (isVisible) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setTitle(o44Var.e);
        setCheckable(o44Var.isCheckable());
        if (i44Var.o()) {
            if (i44Var.n()) {
                c3 = o44Var.j;
            } else {
                c3 = o44Var.h;
            }
            if (c3 != 0) {
                z = true;
                i44Var.n();
                if (z) {
                    o44 o44Var2 = this.A;
                    i44 i44Var2 = o44Var2.n;
                    if (i44Var2.o()) {
                        if (i44Var2.n()) {
                            c2 = o44Var2.j;
                        } else {
                            c2 = o44Var2.h;
                        }
                    }
                }
                i3 = 8;
                if (i3 == 0) {
                    TextView textView = this.e0;
                    o44 o44Var3 = this.A;
                    i44 i44Var3 = o44Var3.n;
                    Context context = i44Var3.a;
                    if (i44Var3.n()) {
                        c = o44Var3.j;
                    } else {
                        c = o44Var3.h;
                    }
                    if (c == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        if (i44Var3.n()) {
                            i2 = o44Var3.k;
                        } else {
                            i2 = o44Var3.i;
                        }
                        o44.b(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        o44.b(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        o44.b(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        o44.b(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        o44.b(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        o44.b(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c != '\b') {
                            if (c != '\n') {
                                if (c != ' ') {
                                    sb2.append(c);
                                } else {
                                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                                }
                            } else {
                                sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                            }
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.e0.getVisibility() != i3) {
                    this.e0.setVisibility(i3);
                }
                setIcon(o44Var.getIcon());
                setEnabled(o44Var.isEnabled());
                setSubMenuArrowVisible(o44Var.hasSubMenu());
                setContentDescription(o44Var.q);
            }
        }
        z = false;
        i44Var.n();
        if (z) {
        }
        i3 = 8;
        if (i3 == 0) {
        }
        if (this.e0.getVisibility() != i3) {
        }
        setIcon(o44Var.getIcon());
        setEnabled(o44Var.isEnabled());
        setSubMenuArrowVisible(o44Var.hasSubMenu());
        setContentDescription(o44Var.q);
    }

    @Override // defpackage.c54
    public o44 getItemData() {
        return this.A;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.i0);
        TextView textView = (TextView) findViewById(R.id.title);
        this.R = textView;
        int i = this.j0;
        if (i != -1) {
            textView.setTextAppearance(this.k0, i);
        }
        this.e0 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.m0);
        }
        this.g0 = (ImageView) findViewById(R.id.group_divider);
        this.h0 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.B != null && this.l0) {
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
        if (z || this.L != null || this.d0 != null) {
            if ((this.A.x & 4) != 0) {
                if (this.L == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.L = radioButton;
                    LinearLayout linearLayout = this.h0;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.L;
                view = this.d0;
            } else {
                if (this.d0 == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.d0 = checkBox;
                    LinearLayout linearLayout2 = this.h0;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.d0;
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
            CheckBox checkBox2 = this.d0;
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
                LinearLayout linearLayout = this.h0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.L;
        } else {
            if (this.d0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.d0 = checkBox;
                LinearLayout linearLayout2 = this.h0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.d0;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.p0 = z;
        this.l0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.g0;
        if (imageView != null) {
            if (!this.n0 && z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        i44 i44Var = this.A.n;
        boolean z = this.p0;
        if (z || this.l0) {
            ImageView imageView = this.B;
            if (imageView != null || drawable != null || this.l0) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.B = imageView2;
                    LinearLayout linearLayout = this.h0;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable == null && !this.l0) {
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
