package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ru1 implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ ru1(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.A;
        ViewGroup viewGroup = null;
        Object obj = this.R;
        Object obj2 = this.L;
        Object obj3 = this.B;
        switch (i) {
            case 0:
                on2 on2Var = (on2) obj;
                int i2 = EmulatorActivity.Z1;
                ((ac) obj3).dismiss();
                Handler handler = ((EmulatorActivity) obj2).N0;
                if (handler != null) {
                    handler.post(new fe(3, on2Var));
                    return;
                } else {
                    nb3.a0("handler");
                    throw null;
                }
            case 1:
                on2 on2Var2 = (on2) obj;
                int i3 = EmulatorActivity.Z1;
                ((ac) obj3).dismiss();
                Handler handler2 = ((EmulatorActivity) obj2).N0;
                if (handler2 != null) {
                    handler2.post(new fe(4, on2Var2));
                    return;
                } else {
                    nb3.a0("handler");
                    throw null;
                }
            default:
                ImageView imageView = (ImageView) obj;
                Context context = ((BiosDirectoryPickerPreference) obj3).getContext();
                context.getClass();
                vr4[] vr4VarArr = ((dz0) obj2).d;
                vr4VarArr.getClass();
                boolean z = false;
                View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_config_files, (ViewGroup) null, false);
                LinearLayout linearLayout = (LinearLayout) gi2.B(inflate, R.id.layoutFileItems);
                if (linearLayout != null) {
                    PopupWindow popupWindow = new PopupWindow((LinearLayout) inflate, -2, -2);
                    popupWindow.setOutsideTouchable(true);
                    int length = vr4VarArr.length;
                    int i4 = 0;
                    while (i4 < length) {
                        vr4 vr4Var = vr4VarArr[i4];
                        View inflate2 = LayoutInflater.from(context).inflate(R.layout.item_file_status, viewGroup, z);
                        int i5 = R.id.imageViewFileStatus;
                        ViewGroup viewGroup2 = viewGroup;
                        ImageView imageView2 = (ImageView) gi2.B(inflate2, R.id.imageViewFileStatus);
                        if (imageView2 != null) {
                            TextView textView = (TextView) gi2.B(inflate2, R.id.textFileName);
                            if (textView != null) {
                                LinearLayout linearLayout2 = (LinearLayout) inflate2;
                                int i6 = cb2.a[((bz0) vr4Var.B).ordinal()];
                                if (i6 != 1) {
                                    if (i6 != 2) {
                                        if (i6 == 3) {
                                            imageView2.setImageResource(R.drawable.ic_status_error);
                                            imageView2.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.statusError)));
                                        } else {
                                            i.d();
                                            return;
                                        }
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_status_warn);
                                        imageView2.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.statusWarn)));
                                    }
                                } else {
                                    imageView2.setImageResource(R.drawable.ic_status_ok);
                                    imageView2.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.statusOk)));
                                }
                                textView.setText((CharSequence) vr4Var.A);
                                linearLayout.addView(linearLayout2);
                                i4++;
                                viewGroup = viewGroup2;
                                z = false;
                            } else {
                                i5 = R.id.textFileName;
                            }
                        }
                        u34.x("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i5)));
                        return;
                        break;
                    }
                    imageView.getClass();
                    popupWindow.getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    Rect rect = new Rect();
                    int i7 = iArr[0];
                    rect.left = i7;
                    rect.top = iArr[1];
                    rect.right = imageView.getWidth() + i7;
                    rect.bottom = imageView.getHeight() + iArr[1];
                    popupWindow.showAtLocation(imageView, 8388659, rect.right - popupWindow.getContentView().getMeasuredWidth(), rect.height() + rect.top);
                    return;
                }
                u34.x("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.layoutFileItems)));
                return;
        }
    }
}
