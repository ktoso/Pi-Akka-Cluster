
lazy val pi_cluster_master = (project in file("."))
  .aggregate(
    common,
    exercise_000_initial_state,
    exercise_001_UDP_experiments,
    exercise_002_split_off_LED_status_monitor,
    exercise_003_cluster_state_monitor_improved,
    exercise_004_cluster_base,
    exercise_005_cluster_base_move_to_artery_tcp,
    exercise_006_cluster_weakly_up,
    exercise_007_cluster_cluster_singleton,
    exercise_008_cluster_the_perils_of_auto_downing,
    exercise_009_cluster_weakly_up_disabled,
    exercise_010_split_brain_resolver_keep_majority,
    exercise_011_split_brain_resolver_static_quorum,
    exercise_012_split_brain_resolver_keep_referee,
    exercise_013_split_brain_resolver_keep_oldest,
    exercise_014_split_brain_resolver_static_quorum_http_mamagement,
    exercise_015_clustered_sudoku_solver,
    exercise_016_add_cluster_client,
    exercise_017_clustered_sudoku_solver_cluster_client_enabled,
    exercise_018_es_viszeral,
    exercise_019_es_opentracing,
    exercise_020_es_classic_console
 ).settings(CommonSettings.commonSettings: _*)

lazy val common = project.settings(CommonSettings.commonSettings: _*)

lazy val exercise_000_initial_state = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_001_UDP_experiments = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_002_split_off_LED_status_monitor = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_003_cluster_state_monitor_improved = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_004_cluster_base = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_005_cluster_base_move_to_artery_tcp = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_006_cluster_weakly_up = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_007_cluster_cluster_singleton = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_008_cluster_the_perils_of_auto_downing = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_009_cluster_weakly_up_disabled = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_010_split_brain_resolver_keep_majority = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_011_split_brain_resolver_static_quorum = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_012_split_brain_resolver_keep_referee = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_013_split_brain_resolver_keep_oldest = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_014_split_brain_resolver_static_quorum_http_mamagement = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_015_clustered_sudoku_solver = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_016_add_cluster_client = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_017_clustered_sudoku_solver_cluster_client_enabled = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_018_es_viszeral = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_019_es_opentracing = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")

lazy val exercise_020_es_classic_console = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")
       