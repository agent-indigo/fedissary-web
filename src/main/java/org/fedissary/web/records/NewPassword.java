package org.fedissary.web.records;
public record NewPassword(
  String currentPassword,
  String newPassword,
  String confirmNewPassword
) {}